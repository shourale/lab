package q.practice7;

public class TestMathFunc {
    public static void main(String[] args) {
        MathFunc functions = new MathFunc();
        MathCalculable calculator = functions;
        System.out.println("2^3 = " + calculator.power(2, 3));
        System.out.println("|3 + 4i| = " + calculator.complexModulus(3, 4));
        System.out.printf("Длина окружности радиуса 5: %.2f%n", functions.circumference(5));
    }
}
