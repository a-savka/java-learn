import java.util.Scanner;

public class Lesson2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int number = Math.abs(scanner.nextInt());
        int y = 1;
        int digitCount = 0;
        do  {
            digitCount++;
            y *= 10;
        } while (number / y > 0);
        System.out.println(digitCount);
    }
}
