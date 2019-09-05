package domein;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<T> implements Enumeration<T> {

    private final Iterator i;

    public IteratorEnumeration(Iterator i) {
        this.i = i;
    }

    @Override
    public boolean hasMoreElements() {
        return i.hasNext();
    }

    @Override
    public T nextElement() {
        return (T) i.next();
    }

}
