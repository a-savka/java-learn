import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int m = in.nextInt();
        System.out.print("Введите m: ");
        int n = in.nextInt();
        System.out.print("Введите k: ");
        int k = in.nextInt();
        int r = m / k;
        int c = n / k;
        int res = r * c;
        System.out.print("Ответ: " + res);
    }

}
