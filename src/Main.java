public class Main {

    public static void main(String[] args) {
        Queue<Integer> queueArray = new QueueArray<>(3);
        System.out.println(queueArray.peek());
        System.out.println("First time, QueArray isEmpty(): " + queueArray.isEmpty());
        System.out.println("First time, QueArray isFull(): " + queueArray.isFull());
        System.out.println("First time, QueArray getSize(): " + queueArray.getSize());

    }


}
