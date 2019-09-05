package domein;

import exceptions.EmptyListException;
import java.util.Iterator;

public class MyListIterable<T> implements Iterable<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private String nameList;

    public MyListIterable() {
        this("List");
    }

    public MyListIterable(String name) {
        nameList = name;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return nameList + " is empty";
        }

        StringBuilder buffer = new StringBuilder();
        buffer.append("The ").append(nameList).append(" is: ");

        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            buffer.append(iterator.next()).append("  ");
        }
        return buffer.toString();
    } // end method toString

    public void insertAtFront(T data) {
        Node<T> aNode = new Node<>(data);
        if (isEmpty()) {
            firstNode = lastNode = aNode;
        } else {
            aNode.setNext(firstNode);
            firstNode = aNode;
        }
    }

    public void insertAtBack(T data) {
        Node<T> aNode = new Node<>(data);
        if (isEmpty()) {
            firstNode = lastNode = aNode;
        } else {
            lastNode.setNext(aNode);
            lastNode = lastNode.getNext();
        }
    }

    public T removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(nameList);
        }

        T removedItem = firstNode.getData();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }

        return removedItem;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        private Node<T> current = MyListIterable.this.firstNode;
        private Node<T> previous = null;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }

    }

}

