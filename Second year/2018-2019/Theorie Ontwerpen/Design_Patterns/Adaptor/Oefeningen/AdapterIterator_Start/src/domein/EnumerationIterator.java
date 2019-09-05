package domein;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<T> implements Iterator<T> {

    private Enumeration<T> e;

    public EnumerationIterator(Enumeration e) {
        this.e = e;
    }

    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public T next() {
        return e.nextElement();
    }

}
