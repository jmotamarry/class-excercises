public class HashNode {
    public SinglyLinkedList list;
    public int key;
    public int value;
    public int next;

    public HashNode(int key, int value) {
        list = new SinglyLinkedList();
        this.key = key;
        this.value = value;
        next = null;
    }
}