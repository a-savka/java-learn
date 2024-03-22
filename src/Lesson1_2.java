public class Lesson1_2 {

    public static void main(String[] args) {
        printChar();
    }

    private static void floats() {
        float f1 = 123.4f;
        double d1 = 124.4;
        double d2 = 125.4d;

        double d3 = 125e-310;

        System.out.println(d3);
    }

    private static void printChar() {
        char c1 = 'f';
        char c2 = '\t';
        char c3 = '\u00A9';

        System.out.println(c3);
        System.out.println("" + c1 + c2 + c3);
    }

}
