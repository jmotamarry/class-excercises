public class Stack {
    Node head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        Node tempNode = null;

        if (isEmpty()) {
            tempNode = new Node(data, null);
        } else {
            tempNode = new Node(data, head);
        }

        head = tempNode;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLength() {
        int counter = 0;
        Node curr = head;
        while (curr != null) {
            counter += 1;
            curr = curr.next;
        }
        return counter;
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(5);
        s.push(3);
        s.push(4);
        
        System.out.println("Stack Length: " + s.getLength());
        System.out.println("Pop 1: " + s.pop());
        System.out.println("Peek 2: " + s.peek());
        System.out.println("Pop 2: " + s.pop());
        System.out.println("New length: " + s.getLength());
    }
}