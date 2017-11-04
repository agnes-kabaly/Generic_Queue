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
        System.out.println("Third time, peek() is: " + queueArray.peek());
    }


}
