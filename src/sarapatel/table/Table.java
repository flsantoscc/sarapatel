package sarapatel.table;

public abstract class Table {
    abstract void enter(Entry entry) throws TableError;

    abstract Entry lookup(String name) throws TableError;
}
