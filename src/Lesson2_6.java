import java.util.Scanner;

public class Lesson2_6 {

    public static void main(String[] args) {
        fizBuzz2();
    }

    public static void fizBuzz1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizBuzz2() {
        for (int i = 1; i <= 100; i++) {
            String fb = "";
            if (i % 3 == 0) {
                fb += "Fizz";
            }
            if (i % 5 == 0) {
                fb += "Buzz";
            }
            System.out.println(fb != "" ? fb : i);
        }
    }

}
