import java.util.Scanner;

public class Lesson1_5 {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s1s2";

        boolean eq1 = s3.equals(s1 + s2);
        System.out.println(eq1);

        boolean eq2 = s1 == (s1 + s2);
        System.out.println(eq2);

        boolean eq3 = "s1" == "s1";
        System.out.println(eq3);

        String s11 = "s1";
        String s12 = "s1";
        boolean eq4 = s11 == s12;
        System.out.println(eq4);

    }

}
