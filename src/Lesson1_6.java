import java.util.Scanner;

public class Lesson1_6 {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        long start = System.currentTimeMillis();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 66_500_000; i++) {
            res.append(i);
        }
        long end = System.currentTimeMillis();
        var sec = (end - start) / 1000;
        System.out.println(sec);
    }
    private static void test2() {
        long start = System.currentTimeMillis();
        String res = "";
        for (int i = 0; i < 120_000; i++) {
            res += i;
        }
        long end = System.currentTimeMillis();
        var sec = (end - start) / 1000;
        System.out.println(sec);
    }

}
