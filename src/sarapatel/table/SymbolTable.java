package sarapatel.table;

import java.util.Hashtable;

import sarapatel.iterator.ConcreteAggregate;

/**
 * SymbolTable
 */
public class SymbolTable extends Table {
    private Hashtable ht;
    private ConcreteAggregate entry_imp_hasBlock;
    private ConcreteAggregate all_bt_object;
    private BT current;
    private int scope[];
    private int level;
    private int no;

    public SymbolTable() {
        ht = new Hashtable();
        entry_imp_hasBlock = new ConcreteAggregate();
        all_bt_object = new ConcreteAggregate();
        current = null;
        scope = new int[10];
    }

    public void initialize() {
        no = 0;
        level = 0;
    }

    public void enterBlock() {
        if (all_bt_object.getLength() - 1 < no) {
            if (no == 0) {
                entry_imp_hasBlock.add(no, null);
            } else {
                ST st = current.getBl();
                if (st != null && st.getEntry() instanceof hasBlock) {
                    entry_imp_hasBlock.add(no, st.getEntry());
                } else {
                    entry_imp_hasBlock.add(no, null);
                }
            }
            current = new BT(no);
            all_bt_object.add(no, current);
        } else {
            current = (BT) all_bt_object.get(no);
        }
        scope[level] = no;
        System.out.println("enter block [" + no + " ]");

        level = level + 1;
        no = no + 1;
    }

    public void exitBlock() {
        System.out.println("exit block[" + scope[level - 1] + "]");
        level = level - 1;
        if (level != 0) {
            current = (BT) all_bt_object.get(scope[level - 1]);
        }
    }

    public void enterRecord() {
        enterBlock();
    }

    public int exitRecord() {
        System.out.println("exit record[" + scope[level - 1] + "]");
        level = level - 1;
        if (level != 0) {
            current = (BT) all_bt_object.get(scope[level - 1]);
        }
        return scope[level];
    }

    public void enter(Entry entry) throws TableError {
        System.out.println("enter \"" + entry.getName() + "\"(" + entry.getClass() + ")");
        String name = entry.getName();
        entry.setLevel(level - 1);
        int current_block_no = current.getNo();
        ST st = new ST(entry, current_block_no);

        if (!ht.containsKey(name)) {
            NT nt = new NT(name, st);
            ht.put(name, nt);
        } else {
            NT nt = (NT) ht.get(name);
            ST il = nt.getIl();

            if (il.getNo() == current_block_no) {
                throw new TableError(name + " is already declared");
            } else {
                st.setIl(il);
                nt.setIl(st);
            }
        }

        ST bl = current.getBl();
        if (bl != null) {
            st.setBl(bl);
        }
        current.setBl(st);
    }

    private NT getNT(String name) {
        if (!ht.containsKey(name)) {
            return null;
        } else {
            NT nt = (NT) ht.get(name);
            return nt;
        }
    }

    public Entry lookup(String name) throws TableError {
        NT nt = getNT(name);
        if (nt != null) {
            for (int i = level - 1; i >= 0; i--) {
                Entry entry = nt.get(scope[i]);
                if (entry != null) {
                    return entry;
                }
            }
        }
        throw new TableError(name + " is not declared");
    }

    public Entry lookup(String name, int bn) throws TableError {
        NT nt = getNT(name);
        if (nt != null) {
            Entry entry = nt.get(bn);
            if (entry != null) {
                return entry;
            }
        }
        throw new TableError(name + " is not declared");
    }

    public Entry getCurrent() {
        for (int i = level - 1; i > 0; i--) {
            Entry tmp = (Entry) entry_imp_hasBlock.get(scope[i]);
            if (tmp instanceof hasBlock) {
                return tmp;
            }
        }
        return null;
    }

    public int getLevel() {
        return level - 1;
    }

}
