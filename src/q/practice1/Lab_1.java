package q.practice1;

public class Lab_1 {
    public static void main (String [] args){
        long summ=0;
        int[] mass = {1, 2, 3, 4};
        for (int j=0; j<mass.length; j++){
            summ+=mass[j];
        }
        System.out.print("Сумма: ");
        System.out.println(summ);
        System.out.print("Ср. Арифм.: ");
        System.out.println((double) summ/mass.length);
    }
}

