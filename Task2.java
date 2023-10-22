import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int day = sc.nextInt();
        System.out.println("Введите час");
        int hour = sc.nextInt();
        System.out.println("Введите минуты");
        int minutes = sc.nextInt();
        System.out.println("Введите секунды");
        int sec = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minutes);
        c.set(Calendar.SECOND, sec);
        Date userdate = new Date(c.get(Calendar.YEAR) - 1900, c.get(Calendar.MONTH) - 1, c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
        Date date = new Date();
        System.out.println("Текущая дата : " + date);
        System.out.println("Дата, введенная пользователем : " + userdate);
        if (userdate.before(date)) {
            System.out.println("Введенная дата раньше текущей");
        } else if (userdate.after(date)) {
            System.out.println("Введенная дата  позже текущей");
        } else {
            System.out.println("Дата совпадает с текущей");
        }
    }
}
