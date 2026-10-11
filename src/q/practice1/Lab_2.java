package q.practice1;
import java.util.Scanner;

public class Lab_2 {
    public static void main ( String[] args){
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        if (i <= 0) {
            System.out.println("Размер массива должен быть положительным");
            return;
        }
        int j=0;
        long summDo=0;
        long summ=0;
        int[] a=new int[i];
        do {
            a[j]=sc.nextInt();
            summDo+=a[j];
            j++;
        }
        while (j<a.length);
        j=0;
        int max=a[0];
        int min=a[0];

        while (j<a.length){
            summ+=a[j];
            if (min>a[j]) min=a[j];
            if (max<a[j]) max=a[j];
            j++;
        }
        System.out.println("Сумма (do while): " + summDo);
        System.out.println("Сумма (while): " + summ + " Макс: " + max + " Мин: " + min);
    }
}
