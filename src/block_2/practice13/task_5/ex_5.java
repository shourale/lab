package block_2.practice13.task_5;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите телефон:");
        PhoneNumber number=new PhoneNumber(scan.nextLine());
        System.out.println(number);
    }
}
