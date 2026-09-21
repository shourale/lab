package q;
import java.util.Scanner;

public class Lab_1 {
    public static void main (String [] args){
        int summ=0;
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        int[] mass = new int[i];
        for (int j=0; j<mass.length; j++){
            int r = sc.nextInt();
            mass[j]=r;
            summ+=mass[j];
        }
        System.out.print("Сумма: ");
        System.out.println(summ);
        System.out.print("Ср. Арифм.: ");
        System.out.println(summ/mass.length);
    }
}

