package sarapatel.iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < aggregate.getLength();
    }

    public Object next() {
        Object object = aggregate.get(index);
        index++;
        return object;
    }

}
