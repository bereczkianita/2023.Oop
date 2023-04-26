import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private final ArrayList<Object> data;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;

        this.data = new ArrayList<>();
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void enQueue(Object deQueue) {

    }

    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void printQueue() {

    }
}

