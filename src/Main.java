import ArrayQueue.ArrayQueue;

public class Main {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(4);

        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue);

        queue.push(7);
        System.out.println(queue);

        queue.pop();
        queue.pop();
        System.out.println(queue);

        queue.push(8);
        queue.push(9);
        System.out.println(queue);

    }
}