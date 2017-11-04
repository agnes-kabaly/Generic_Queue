public class Main {

    public static void main(String[] args) {
        Queue<Integer> queueArray = new QueueArray<>(3);
        System.out.println(queueArray.peek());
        System.out.println("First time, QueArray isEmpty(): " + queueArray.isEmpty());
        System.out.println("First time, QueArray isFull(): " + queueArray.isFull());
        System.out.println("First time, QueArray getSize(): " + queueArray.getSize());

        queueArray.enqueue(11);
        System.out.println("After enqueue(), peek() is: " + queueArray.peek());
        System.out.println("Second time, QueArray isEmpty(): " + queueArray.isEmpty());
        System.out.println("Second time, QueArray isFull(): " + queueArray.isFull());
        System.out.println("Second time, QueArray getSize(): " + queueArray.getSize());

        queueArray.enqueue(24);
        queueArray.enqueue(55);
        System.out.println("Third time, QueArray isFull(): " + queueArray.isFull());

        queueArray.enqueue(66);
        System.out.println("Third time, QueArray getSize(): " + queueArray.getSize());
        System.out.println("Third time, peek() is: " + queueArray.peek() + "\n");

        queueArray.dequeue();
        System.out.println("After dequeue(), peek() is: " + queueArray.peek());
        System.out.println("Last time, QueArray isEmpty(): " + queueArray.isEmpty());
        System.out.println("Last time, QueArray isFull(): " + queueArray.isFull());
        System.out.println("Last time, QueArray getSize(): " + queueArray.getSize());

        queueArray.display();

        Queue<Integer> queueLinkedList = new QueueLinkedList<>();
        System.out.println(queueLinkedList.peek());
        System.out.println("First time, QueLinkedList isEmpty(): " + queueLinkedList.isEmpty());
        System.out.println("First time, QueLinkedList isFull(): " + queueLinkedList.isFull());
        System.out.println("First time, QueLinkedList getSize(): " + queueLinkedList.getSize());
        queueLinkedList.display();

        queueLinkedList.enqueue(11);
        System.out.println("After enqueue(), peek() is: " + queueLinkedList.peek());
        System.out.println("Second time, QueLinkedList isEmpty(): " + queueLinkedList.isEmpty());
        System.out.println("Second time, QueLinkedList isFull(): " + queueLinkedList.isFull());
        System.out.println("Second time, QueLinkedList getSize(): " + queueLinkedList.getSize());
        queueLinkedList.display();

        queueLinkedList.enqueue(88);
        queueLinkedList.enqueue(132);
        System.out.println("After 2. & 3. enqueue(), peek() is: " + queueLinkedList.peek());
        System.out.println("Third time, QueLinkedList isEmpty(): " + queueLinkedList.isEmpty());
        System.out.println("Third time, QueLinkedList isFull(): " + queueLinkedList.isFull());
        System.out.println("Third time, QueLinkedList getSize(): " + queueLinkedList.getSize());
        System.out.println("Last peek() is: " + queueLinkedList.peek());
        queueLinkedList.display();

        queueLinkedList.dequeue();
        System.out.println("After 1. dequeue(), peek() is: " + queueLinkedList.peek());
        System.out.println("Last time, QueLinkedList getSize(): " + queueLinkedList.getSize());
        queueLinkedList.display();

        queueLinkedList.dequeue();
        queueLinkedList.display();

        queueLinkedList.dequeue();
        queueLinkedList.display();

        queueLinkedList.dequeue();
        queueLinkedList.enqueue(1248);
        System.out.println("QueLinkedList peek(): " + queueLinkedList.peek());

    }


}
