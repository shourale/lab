package q.practice7;

public class TestMathFunc {
    public static void main(String[] args) {
        MathCalculable calculator = new MathFunc();
        System.out.println("2^3 = " + calculator.power(2, 3));
        System.out.println("|3 + 4i| = " + calculator.complexModulus(3, 4));
        MathFunc functions = new MathFunc();
        System.out.printf("Длина окружности радиуса 5: %.2f%n", functions.circumference(5));
    }
}
