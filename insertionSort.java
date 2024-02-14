public class insertionSort {

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int j = i;
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 5, 3, 7, 2, 4, 3, 5};
        insertionSort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}