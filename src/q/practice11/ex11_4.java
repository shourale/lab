package q.practice11;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ex11_4 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int y,m,d,h,min;
        y=scan.nextInt();
        m=scan.nextInt();
        d=scan.nextInt();
        h=scan.nextInt();
        min=scan.nextInt();
        Calendar cal=Calendar.getInstance();
        cal.clear();
        cal.set(y,m-1,d,h,min);
        Date date= cal.getTime();
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yy HH:mm");
        System.out.println(f.format(date));
    }
}
