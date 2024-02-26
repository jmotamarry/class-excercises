public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void printList() {
        Node currNode = head;
        while(currNode.next != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }

    public void insertAtFront(int data) {
        Node tempNode = head;
        head = new Node(data, head);
        head.next = tempNode;
    }

    public void insertAfter(Node in, int key) {
        Node curr = head;
        while (true) {
            if (curr.next == null) {
                curr.next = in;
                break;
            
            }
            if (curr.data == key) {
                in.next = curr.next;
                curr.next = in;
                break;
            }
            curr = curr.next;
        }
    }

    public void remove(int key) {
        Node curr = head;

        if (head.data == key) {
            head = head.next;
        }

        else {
            while (true) {
                if (curr.next == null) {
                    break;
                }
                if (curr.next.data == key) {
                    curr.next = curr.next.next;
                    break;
                }
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(8, null);
        SinglyLinkedList list = new SinglyLinkedList(head);
        System.out.println(list.head.data);
        list.printList();
        list.insertAtFront(7);
        list.insertAtFront(9);
        list.insertAfter(new Node(9, null), 7);
        list.remove(9);
        list.printList();
    }
}