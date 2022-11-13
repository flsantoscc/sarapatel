package sarapatel.semantic;

import sarapatel.iterator.ConcreteAggregate;
import sarapatel.table.Entry;
import sarapatel.table.Parametro;
import sarapatel.table.Tipo;

/**
 * Information
 */
public class Information {
    private int line;
    private int pos;
    private boolean bool;
    protected String string;
    protected Entry entry;
    protected ConcreteAggregate list;

    public Information() {
    }

    public String getString() {
        return string;
    }

    public Tipo getTipo() {
        return (Tipo) entry;
    }

    public Parametro getParametro() {
        return (Parametro) entry;
    }

    public Entry getEntry() {
        return entry;
    }

    public int getLine() {
        return line;
    }

    public int getPos() {
        return pos;
    }

    public ConcreteAggregate getList() {
        return list;
    }

    public void set(String string) {
        this.string = string;
    }

    public void set(ConcreteAggregate list) {
        this.list = list;
    }

    public void set(int line, int pos) {
        this.line = line;
        this.pos = pos;
    }

    public void set(Entry entry) {
        this.entry = entry;
    }

    public void setRValor() {
        this.bool = false;
    }

    public void setRVar() {
        this.bool = true;
    }

    public boolean isRVar() {
        return bool;
    }
}
