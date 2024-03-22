import java.util.Scanner;

public class Lesson2_4 {

    public static void main(String[] args) {
        test3();
    }

    public static void test1() {
        int i = 0;
        while (i < 10) {
            System.out.println((i));
            i++;
        }
        System.out.println(("---"));
        i = 0;
        do  {
            System.out.println((i));
            i++;
        } while((i < 10));
    }

    public static void test2() {
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
    }

    public static void test3() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(String.format("%-3d", j));
            }
            System.out.println();
        }
    }

    public static void test11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int x = scanner.nextInt();
//        for (int i = 0; i <= x; x--) {
        for (; 0 <= x; x--) {
            System.out.println(x);
        }
    }

}
