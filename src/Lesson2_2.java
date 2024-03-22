
import java.util.Scanner;
public class Lesson2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ticket num: ");
        int ticketNum = scanner.nextInt();
        checkNum1(ticketNum);
    }

    public static void checkNum1(int ticketNum) {
        String left = String.format("%06d", ticketNum).substring(0,3);
        String right = String.format("%06d", ticketNum).substring(3,6);
        System.out.println(left);
        System.out.println(right);
        int sumLeft = Character.getNumericValue(left.charAt(0)) +
                Character.getNumericValue(left.charAt(1)) +
                Character.getNumericValue(left.charAt(2));
        int sumRight = Character.getNumericValue(right.charAt(0)) +
                Character.getNumericValue(right.charAt(1)) +
                Character.getNumericValue(right.charAt(2));
        if (sumLeft == sumRight) {
            System.out.println("We are happy now!");
        } else {
            System.out.println("oops...");
        }
    }

}
