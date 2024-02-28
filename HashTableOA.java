public class HashTableOA {
    private int capacity;
    private int size;
    private HashNode[] table;
    static final Object DELETED = new Object();

    public HashTableOA(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = new HashNode[capacity];
    }

    public int hash(Object key) {
        int hash = key.hashCode() % capacity;
        if (hash < 0) {
            hash += capacity;
        }
        return hash;
    }

    public boolean insert(Object key, Object value) {
        int index = hash(key);
        int originalIndex = index;

        do {
            if (table[index] == null || table[index].key == DELETED) {
                table[index] = new HashNode(key, value);
                size++;
                return true;
            }

            if (table[index].key.equals(key)) {
                table[index].value = value;
                return true;
            }
            index = (index + 1) % capacity;
        } while (index != originalIndex);

        return false;
    }

    public boolean delete(Object key) {
        int index = hash(key);
        int originalIndex = index;

        do {
            if (table[index] == null) {
                return false;
            }

            if (table[index].key.equals(key)) {
                table[index].key = DELETED;
                return true;
            }
            index = (index + 1) % capacity;
        } while (index != originalIndex);
        return false;
    }

    public Object search(Object key) {
        int index = hash(key);
        int originalIndex = index;

        do {
            if (table[index] == null) {
                return false;
            }

            if (table[index].key.equals(key)) {
                return table[index].value;
            }
            index = (index + 1) % capacity;
        } while (index != originalIndex);
        return false;
    }

    public static void main(String[] args) {
        HashTableOA table = new HashTableOA(10);

        table.insert("50", "fifty");
        System.out.println(table.search("50"));
        table.delete("50");
        System.out.println(table.search("50"));
    }
}