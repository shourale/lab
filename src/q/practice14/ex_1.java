package q.practice14;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        String[] words=input.split("\\s+");
        for (String i:words){
            System.out.println(i);
        }
    }
}
