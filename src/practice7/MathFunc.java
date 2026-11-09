package practice7;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circumference(double radius) {
        if (radius < 0) {
            System.out.println("Радиус не может быть отрицательным");
            return -1;
        }
        return 2 * PI * radius;
    }
}
