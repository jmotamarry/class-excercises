public class HashTable {
    HashNode[] table;
    int length;
    int used;

    public HashTable(int tableLen) {
        length = tableLen;
        table = new HashNode[tableLen];
        used = 0;
    }

    public int hash(Object key) {
        int hash = key.hashCode() % length;
        if (hash < 0) {
            hash += length;
        }
        return hash;
    }

    public void insert(Object key, Object value) {

    }

    public boolean remove(Object Key) {
        int indexBucket = hash(key);
        HashNode item = table[indexBucket];
        HashNode previous = null;

        while (item != null) {
            if (key.equals(item.key)) {
                if (previous == null && item.next == null) {
                    table[indexBucket] = null;
                } else {
                    previous.next = item.next;
                }
                return true;
            }
            previous = item;
            item = item.next;
        }
        return false;
    }

    public static void main(String args) {
        HashTable table = new HashTable(100);
        
    }
}