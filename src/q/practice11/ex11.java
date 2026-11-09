package q.practice11;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) throws java.text.ParseException{
        Date now=new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date received = format.parse("28.10.2026 00:00:00");
        System.out.println("Разработчик: Khusainov");
        System.out.println("Получено: " + format.format(received));
        System.out.println("Сдано: " + format.format(now));
    }
}
