package ArrayStack;

import java.util.Arrays;

public class ArrayStack {

    private int top;
    private int[] stack;
    private int size;

    public ArrayStack( int size){
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int item) {
        stack[++top] = item;

    }

    public int pop() {
        int pop = stack[top];
        stack[top--] = 0;
        return pop;
    }

    public void peek() {
        System.out.println(stack[top]);
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
