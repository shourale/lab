package practice1;

public class Prac_1_5 {
    public static int fac(int n) {
        if (n < 0 || n > 12) {
            System.out.println("Для int число должно быть от 0 до 12");
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
