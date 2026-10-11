package q.practice3;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public double getRate(String currency) {
        switch (currency.toUpperCase(Locale.ROOT)) {
            case "RUB": return 1;
            case "USD": return 90;
            case "EUR": return 100;
            default: throw new IllegalArgumentException("Неизвестная валюта: " + currency);
        }
    }

    public double convert(double amount, String from, String to) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Сумма должна быть неотрицательной");
        }
        return amount * getRate(from) / getRate(to);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Сумма в USD (дробная часть через точку): ");
        double amount = scanner.nextDouble();
        System.out.println("Учебные курсы: 1 USD = 90 RUB, 1 EUR = 100 RUB");
        System.out.printf("%.2f USD = %.2f RUB%n", amount, converter.convert(amount, "USD", "RUB"));
        System.out.printf("%.2f USD = %.2f EUR%n", amount, converter.convert(amount, "USD", "EUR"));
    }
}
