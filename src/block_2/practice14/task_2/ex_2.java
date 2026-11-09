package block_2.practice14.task_2;

import java.util.Scanner;

public class ex_2 {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        if (string.matches("abcdefghijklmnopqrstuv18340")) System.out.println("Строка является строкой \"abcdefghijklmnopqrstuv18340\"");
        else System.out.println("Строка не является строкой \"abcdefghijklmnopqrstuv18340\"");
    }
}
