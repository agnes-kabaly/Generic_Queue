public class QueueArray<T> implements Queue<T> {

    private int front;
    private int rear;
    private int maxSize;
    private T[] array;
    private int size;

    public QueueArray(int maxSize) {
        front = 0;
        rear = 0;
        size = 0;
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
    }

    @Override
    public void enqueue(T element) {
        if (!isFull()) {
            size++;
            array[rear++] = element;
        } else {
            System.out.println("Queue is full, so enqueue() isn't possible");
        }
    }

    @Override
    public T dequeue() {
        if (!isEmpty()) {
            T element = array[front++];
            size--;
            return element;
        } else {
            System.out.println("Queue is empty, so dequeue() isn't possible");
            return null;
        }
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
        if (rear == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        if (!isEmpty()) {
            return size;
        } else {
            System.out.println("Queue is empty");
            return 0;
        }
    }

    @Override
    public void display() {
        if (!isEmpty()) {
            System.out.println("Queue:");
            for (int i = front; i < rear; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Queue is empty");
        }
    }
}
