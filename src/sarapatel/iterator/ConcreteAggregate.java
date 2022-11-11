package sarapatel.iterator;

import java.util.*;

public class ConcreteAggregate implements Aggregate {
    private LinkedList list;

    public ConcreteAggregate() {
        list = new LinkedList();
    }

    public void add(int index, Object object) {
        if (index < list.size()) {
            list.remove(index);
        }
        list.add(index, object);
    }

    public void add(Object object) {
        list.add(object);
    }

    public Object get(int index) {
        return list.get(index);
    }

    public Object getLast() {
        return list.getLast();
    }

    public int getLength() {
        return list.size();
    }

    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

}
