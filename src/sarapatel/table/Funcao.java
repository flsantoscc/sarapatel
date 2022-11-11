package sarapatel.table;

import sarapatel.iterator.ConcreteAggregate;
import sarapatel.iterator.Iterator;

/**
 * Funcao
 */
public class Funcao extends Entry implements hasParametro, hasTipo {
    private Tipo tipo;
    private ConcreteAggregate list;
    private int label;

    public Funcao(String name, Tipo tipo, ConcreteAggregate list, int label) {
        super(name);
        this.tipo = tipo;
        this.list = list;
        this.label = label;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Iterator getParameter() {
        return list.iterator();
    }

    public int getNumberOfParameter() {
        return list.getLength();
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ConcreteAggregate getList() {
        return list;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

}
