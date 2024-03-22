import java.util.Scanner;

public class Lesson1_3 {

    public static void main(String[] args) {
        testAdd2();
    }

    private static void scanSample() {
        Scanner sc = new Scanner(System.in);

        System.out.print("введите целое: ");
        int i = sc.nextInt();
        System.out.print("введите число: ");
        double d = sc.nextDouble();
        System.out.print("введите строку: ");
        String str = sc.next();
        System.out.println("Ваш ввод: " + i + " " + d + " " + str);
    }

    private static void testTypesAssignment() {
        double d1 = 1;
        int x2 = (int) 2.3;

        byte  b1 = 100;
        byte b2 = (byte)10000;

        int n = 100;
        byte b3 = (byte) n;
        long l1 = n;
    }

    private static void testDiv() {
        var res = 5 / 2;
        var res1 = 5 / 2.0;
        var res2 = 5 / 2d;
        var res3 = 5 / (double) 2;
        System.out.println(res);
    }

    private static void testAdd() {

        byte b1 = 100;
        byte b2 = 100;

        var res = b1  + b2;
        System.out.println(res);
    }

    private static void testAdd2() {

        int b1 = 2_000_000_000;
        int b2 = 2_000_000_000;

        long res = b1  + (long) b2;
        System.out.println(res);
    }

}
