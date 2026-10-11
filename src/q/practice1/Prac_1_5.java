package q.practice1;

public class Prac_1_5 {
    public static int fac(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Для int число должно быть от 0 до 12");
        }
        int factorial = 1;
        for (int i = 1; i < n+1; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main (String[] args){
    System.out.print(fac(5));
}}

