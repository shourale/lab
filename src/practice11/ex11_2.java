package practice11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex11_2 {
    public static void main(String[] args) throws java.text.ParseException {
        System.out.println("Введите дату в формате \"dd.MM.yyyy HH:mm:ss\"");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date inputdate = format.parse(input);
        Date now = new Date();
        long enteredMinute = inputdate.getTime() / 60000;
        long currentMinute = now.getTime() / 60000;
        if (enteredMinute == currentMinute) System.out.println("Введенная дата совпадает с текущей с точностью до минут");
        else if (inputdate.before(now)) System.out.println("Введенная дата раньше текущей");
        else System.out.println("Введенная дата позже текущей");
    }
}
