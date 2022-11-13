package sarapatel.table;

/**
 * ST
 */
public class ST {
    private Entry entry;
    private int bn;
    private ST bl;
    private ST il;

    public ST(Entry entry, int bn) {
        this.entry = entry;
        this.bn = bn;
    }

    public ST getBl() {
        return bl;
    }

    public void setBl(ST st) {
        bl = st;
    }

    public ST getIl() {
        return il;
    }

    public void setIl(ST il) {
        this.il = il;
    }

    public Entry getEntry() {
        return entry;
    }

    public int getNo() {
        return bn;
    }
}
