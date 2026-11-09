package practice14;

import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String pwd=s.nextLine();
        if (pwd.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9_]{8,}")) {System.out.println("Пароль надежный"); return ;}
        System.out.println("Пароль ненадежный");
    }
}
