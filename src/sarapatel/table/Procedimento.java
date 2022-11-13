package sarapatel.table;

import sarapatel.iterator.ConcreteAggregate;
import sarapatel.iterator.Iterator;

/**
 * Procedimento
 */
public class Procedimento extends Entry implements hasParametro {
    private ConcreteAggregate parametros;

    public Procedimento(String name, ConcreteAggregate parametros) {
        super(name);
        this.parametros = parametros;
    }

    @Override
    public int getNumberOfParameter() {
        return parametros.getLength();
    }

    @Override
    public Iterator getParameter() {
        return parametros.iterator();
    }

}
