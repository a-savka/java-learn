
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Lesson1_7 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test1() {
        Date date = new Date();
        Date date1 = new Date(2024, 01, 24);
        System.out.println(date);
        System.out.println(date1);
    }
    private static void test2() {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024, 2, 12);
        LocalDate date3 = date.plusDays(-4);
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(dt1);
        System.out.println(date3.isAfter(date));
    }
    private static void test3() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar();
        System.out.println(format.format(calendar.getTime()));
    }
    private static void test4() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2024, 2, 24);
        System.out.println(format.format(calendar.getTime()));
    }
}
