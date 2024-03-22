
import java.util.Scanner;
public class Lesson2_1 {
    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number > ");
        int i = scanner.nextInt();
        if (i < 0) {
            System.out.println("Less than 0");
        } else if (i == 0) {
            System.out.println("Probably 0");
        } else {
            System.out.println("Greater than 0");
        }
    }

    public static void test2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number > ");
        int i = scanner.nextInt();
        switch (i) {
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("other");
        }
    }

    public static void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number > ");
        int i = scanner.nextInt();
        String result = i > 10 ? "Больше 10" : "Не больше 10";
        System.out.println(result);
    }
}
