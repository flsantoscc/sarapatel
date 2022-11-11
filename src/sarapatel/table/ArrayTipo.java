package sarapatel.table;

import sarapatel.iterator.ConcreteAggregate;

/**
 * ArrayTipo
 */
public class ArrayTipo extends Tipo implements hasTipo {
    private ConcreteAggregate index_list;
    private Tipo tipo;

    public ArrayTipo(int line, int pos, ConcreteAggregate index_list, Tipo tipo) {
        super(line, pos);
        this.index_list = index_list;
        this.tipo = tipo;
    }

    public ConcreteAggregate getIndex() {
        return index_list;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
