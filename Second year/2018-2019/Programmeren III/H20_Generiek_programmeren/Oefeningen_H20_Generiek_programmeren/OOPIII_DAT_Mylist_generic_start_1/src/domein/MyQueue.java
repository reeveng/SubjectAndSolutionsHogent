package domein;

public class MyQueue<T> {

    private MyList<T> list;

    public MyQueue() {
        this("Queue");
    }

    public MyQueue(String naam) {
        list = new MyList<>(naam);
    }

    public void offer(T data) {
        list.insertAtBack(data);
    }

    public T poll() {
        return list.removeFromFront();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
