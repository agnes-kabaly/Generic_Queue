public class QueueLinkedList<T> implements Queue<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        Node<T> node = new Node<T>(element, null);
        if (rear == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = rear.next;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (!isEmpty()) {
            Node<T> newNode = front;
            front = newNode.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return newNode.getData();
        } else {
            System.out.println("Queue is empty, dequeue() isn't possible");
            return null;
        }
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return front.getData();
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        if (isEmpty()) {
            System.out.println("Queue is empty:");
        }
        return size;
    }

    @Override
    public void display() {
        if (!isEmpty()) {
            Node<T> node = front;
            System.out.println(node.toString());
        } else {
            System.out.println("Queue is empty");
        }
    }


}
