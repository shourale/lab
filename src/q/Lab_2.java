package q;
import java.util.Scanner;

public class Lab_2 {
    public static void main ( String[] args){
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int j=0;
        int summ=0;
        int[] a=new int[i];
        do {a[j]=sc.nextInt();j++;}
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
        System.out.print("Сумма: " + summ + " Макс: " + max + " Мин: " + min);
    }
}
