package ArrayQueue;

import java.util.Arrays;

public class ArrayQueue {

    private int rear;
    private int front;
    private int size;

    private int[] queue;

    public ArrayQueue(int size) {
        this.size = size;
        this.rear = 0;
        this.front = 0;
        this.queue = new int[size];
    }

    public boolean IsEmpty() {
        if (rear == front) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsPull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int count() {
        return rear + 1 ;
    }

    public void push(int item) {
        queue[rear++] = item;
    }

    public int peek() {
        return queue[front];
    }

    public int pop() {
        int pop = queue[front];
        queue[front++] = 0;
        return pop;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}
