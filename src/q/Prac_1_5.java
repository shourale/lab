package q;

public class Prac_1_5 {
    public static int fac(int n) {
        int factorial = 1;
        for (int i = 1; i < n+1; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main (String[] args){
    System.out.print(fac(5));
}}

