package q.practice3;

import java.util.Scanner;

public class CurrencyConverter {
    public double getRate(String currency) {
        switch (currency.toUpperCase()) {
            case "RUB": return 1;
            case "USD": return 90;
            case "EUR": return 100;
            default: return 0;
        }
    }

    public double convert(double amount, String from, String to) {
        double fromRate = getRate(from);
        double toRate = getRate(to);
        if (amount < 0 || fromRate == 0 || toRate == 0) {
            System.out.println("Неверная сумма или валюта");
            return -1;
        }
        return amount * fromRate / toRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scan = new Scanner(System.in);
        System.out.print("Сумма в USD (дробная часть через точку): ");
        double amount = Double.parseDouble(scan.nextLine());
        if (amount < 0) {
            System.out.println("Сумма не может быть отрицательной");
            return;
        }
        System.out.println("Учебные курсы: 1 USD = 90 RUB, 1 EUR = 100 RUB");
        System.out.printf("%.2f USD = %.2f RUB%n", amount, converter.convert(amount, "USD", "RUB"));
        System.out.printf("%.2f USD = %.2f EUR%n", amount, converter.convert(amount, "USD", "EUR"));
    }
}
