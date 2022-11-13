package sarapatel.table;

import java.util.Hashtable;

/**
 * TableFactory
 */
public class TableFactory {
    private SymbolTable table = null;
    private Hashtable pool = new Hashtable<>();

    private static TableFactory singleton = new TableFactory();

    private TableFactory() {
    }

    public static TableFactory getInstance() {
        return singleton;
    }

    public synchronized SymbolTable getSymbolTable() {
        if (table == null) {
            table = new SymbolTable();
        }
        table.initialize();
        return table;
    }
}
