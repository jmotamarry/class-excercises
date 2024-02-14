public class quickSort {
    static final int[] numbers = {1, 6, 3, 6, 3, 2, 7, 8, 5};

    public static void sort(int low, int high) {

        if (low >= high) {
            return;
        }

        for (int element : numbers) {
            System.out.print(element + " ");
        }

        int pivot = numbers[high];
        int cursor = low - 1;

        for (int i = low; i < high; i++) {
            if (numbers[i] <= pivot) {
                cursor += 1;
                int temp = numbers[i];
                numbers[i] = numbers[cursor];
                numbers[cursor] = temp;
            }
        }
        int temp = numbers[cursor];
        numbers[cursor] = pivot;
        numbers[high] = temp;
        System.out.println("");
        sort(low, cursor);
        sort(cursor + 1, high);
    }

    public static void main(String[] args) {
        sort(0, numbers.length - 1);
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}