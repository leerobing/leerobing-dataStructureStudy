import stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(3);
        stack.push(6);
        stack.push(9);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

        stack.push(11);
        stack.push(12);
        stack.push(13);
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);




    }
}