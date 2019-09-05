package exceptions;

public class EmptyListException extends RuntimeException {

    public EmptyListException() {
        this("List");
    }

    public EmptyListException(String name) {
        super(String.format("%s is empty", name));
    }
} 

