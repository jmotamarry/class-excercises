import java.util.Scanner;
import java.util.Random;

public class mutualRecursiveRPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computer(0, 0, sc);
    }

    public static boolean player(int pScore, int cScore, String cMove, Scanner sc) {
        System.out.println("The score is computer: " + cScore);
        System.out.println("Player:" + pScore);
        System.out.print("Input rock, paper, or scissors: ");
        String move = sc.nextLine().toLowerCase();
        System.out.println("The computer's move was " + cMove);

        if (move.equals(cMove)) {
            computer(pScore, cScore, sc);
        } else if ((move.equals("rock") && cMove.equals("paper")) || (move.equals("paper") && cMove.equals("scissors")) || (move.equals("scissors") && cMove.equals("rock"))) {
            computer(pScore, cScore + 1, sc);
        } else if ((move.equals("paper") && cMove.equals("rock")) || (move.equals("scissors") && cMove.equals("paper")) || (move.equals("rock") && cMove.equals("scissors"))) {
            computer(pScore + 1, cScore, sc);
        }
        return false;
    }

    public static boolean computer(int pScore, int cScore, Scanner sc) {
        String[] moves = {"rock", "paper", "scissors"};
        String move = moves[(int)(Math.random() * 3)];
        if (pScore == 3) {
            System.out.println("You win");
            return true;
        } else if (cScore == 3) {
            System.out.println("You lose");
            return false;
        }
        return player(pScore, cScore, move, sc);
    }
}