public class Lesson1_1 {

    public static void main(String[] args) {
        var v1 = 41;
        var v2 = 0x29;
        var v3 = 051;
        var v4 =0b101001;

        int v5  = 1_000_000;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println("------------------------");
        test1();
    }

    private static void test1() {

        var v1 = 4;
        var v2 = 9;
        var v3 = 45;
        var v4 = 345;

        System.out.println(String.format("Значение %03d", v1));
        System.out.println(String.format("Значение %3d", v1));
        System.out.println(String.format("Значение %-3d", v1));
        System.out.println(String.format("Значение %03d", v2));
        System.out.println(String.format("Значение %03d", v3));
        System.out.println(String.format("Значение %03d", v4));

    }


}
