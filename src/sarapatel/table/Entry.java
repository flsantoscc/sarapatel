package sarapatel.table;

public class Entry {
    protected String name;
    protected int level;

    public Entry() {

    }

    public Entry(String name) {
        this.name = name;
    }

    public Entry(int line, int pos) {
        this.name = new Integer(line).toString() + "-" + new Integer(pos).toString();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
