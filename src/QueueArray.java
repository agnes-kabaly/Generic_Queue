public class QueueArray<T> implements Queue<T> {

    private int front;
    private int rear;
    private int maxSize;
    private T[] array;

    public QueueArray(int maxSize) {
        front = 0;
        rear = 0;
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
    }

    @Override
    public void enqueue(T element) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return array[front];
        } else {
            System.out.println("Queue is empty, peek() isn't possible:");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (front >= rear || front < 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        if (!isEmpty()) {
            return rear + 1;
        } else {
            System.out.println("Queue is empty");
            return 0;
        }
    }

    @Override
    public void display() {

    }
}
