import ListStack.NodeManager;

public class Main {
    public static void main(String[] args) {
        NodeManager nodeManager = new NodeManager();
        nodeManager.push(4);
        nodeManager.push(5);
        System.out.println(nodeManager.peek());
    }
}