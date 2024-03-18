import java.util.Collections;
import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> arr;

    public Heap() {
        arr = new ArrayList<Integer>();
    }

    private int bubbleUp(int index) {
        if (arr.get(index) == 0) {
            return 0;
        } else {
            int parentIndex = (index - 1) / 2;
            if (arr.get(index) > arr.get(parentIndex)) {
                Collections.swap(arr, index, parentIndex);
            }
            bubbleUp(parentIndex);
        }
        return 0;
    }

    public void insert(int value) {
        arr.add(value);
        bubbleUp(arr.size() - 1);
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(9);
        heap.insert(3);
        heap.insert(7);
        for (int item : heap.arr) {
            System.out.println(item);
        }
    }
}