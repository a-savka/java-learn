import java.util.Scanner;

public class Bin2Sec {

    private static int decode(String binary) {
        int sum = 0;
        int n = binary.length();
        int k = 0;
        int m = 1;
        while (k < n) {
            k++;
            if (binary.charAt(n - k) == '1') {
                sum += m;
            }
            m = m * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Двоичное: ");
        String binary = input.nextLine();
        System.out.println("Десятичное: " + decode(binary));
    }

}
