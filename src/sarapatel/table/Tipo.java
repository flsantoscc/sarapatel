package sarapatel.table;

/**
 * Tipo
 */
public class Tipo extends Entry {
    private int val;

    public Tipo(String name) {
        super(name);
    }

    public Tipo(int line, int pos) {
        super(line, pos);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
