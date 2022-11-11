package sarapatel.table;

import sarapatel.iterator.Iterator;

/**
 * hasParametro
 */
public interface hasParametro extends hasBlock {
    abstract int getLabel();

    abstract void setLabel();

    abstract int getNumberOfParameter();

    abstract Iterator getParameter();
}
