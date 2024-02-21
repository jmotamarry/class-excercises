public class Queue {
    Node head;
    Node tail;
    int size;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        Node tempNode = null;

        if (isEmpty()) {
            tempNode = new Node(data, null);
            head = tempNode;
            tail = tempNode;
        } else {
            tempNode = new Node(data, head);
            tail.next = tempNode;
            tail = tempNode;
        }
        size += 1;
    }

    public int dequeue() {
        size -= 1;
        if (isEmpty()) {
            return 0 / 0;
        } else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return 0 / 0;
        } else {
            return head.data;
        }
    }

    public int getLength() {    // should do this by updating a size variable when pushing or popping
        return size;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        
        System.out.println("Queue Length: " + q.getLength());
        System.out.println("Dequeue 1: " + q.dequeue());
        System.out.println("Peek 2: " + q.peek());
        System.out.println("Dequeue 2: " + q.dequeue());
        System.out.println("New length: " + q.getLength());
    }
}