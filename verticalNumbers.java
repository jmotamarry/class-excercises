import java.util.Scanner;
public class verticalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        printVertical(number);
    }

    static void printVertical(int number) {
        if (number < 0) {
            System.out.println("-");
            printVertical(number * -1);
        } else if (number <= 10) {
            System.out.println(number);
        } else {
            printVertical(number / 10);
            System.out.println(number % 10);
        }
    }
}
