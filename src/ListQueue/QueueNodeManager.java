package ListQueue;

public class QueueNodeManager {
    QueueNode front, rear;
    public QueueNodeManager() {
        front = rear =null;
    }

    public boolean isEmpty() {
        if (front == null && rear == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int item) {
        QueueNode queueNode = new QueueNode(item);
        if (isEmpty()) {
            front = rear = queueNode;
        } else {
            front.setNextNode(queueNode);
            front = queueNode;
        }
    }
    public QueueNode pop() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }else {
            QueueNode popNode = rear;
            rear = rear.getNextNode();
            return popNode;
        }
    }
    public QueueNode peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }else {
            return rear;
        }
    }
    public int size() {
        QueueNode front2 = front;
        QueueNode rear2 = rear;
        int count = 0;
        while(front2 != rear2 && rear2 !=null) { //큐가 비어있는 경우가 있을수도 있을때도 생각해야함
            count++;
            rear2 = rear2.getNextNode();
        }
        return count;
    }
}
