package labb11;
import java.util.*;
public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int day = sc.nextInt();
        System.out.println("Введите часы");
        int hour = sc.nextInt();
        System.out.println("Введите минуты");
        int minutes = sc.nextInt();
        GregorianCalendar c = new GregorianCalendar(year, month-1, day, hour, minutes);

        Date d = new Date(year-1900, c.get(Calendar.MONTH), day, hour, minutes);
        System.out.println("Введенная дата и время в формате Calendar "+ c.getTime());
        System.out.println("Введенная дата и время в формате Date "+ d);

    }
}
