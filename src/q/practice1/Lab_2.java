package q.practice1;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = scan.nextInt();
        if (size <= 0) {
            System.out.println("Размер должен быть положительным");
            return;
        }
        int[] numbers = new int[size];
        int i = 0;
        long sumDo = 0;
        System.out.println("Введите элементы массива:");
        do {
            numbers[i] = scan.nextInt();
            sumDo += numbers[i];
            i++;
        } while (i < numbers.length);

        i = 0;
        long sumWhile = 0;
        int min = numbers[0];
        int max = numbers[0];
        while (i < numbers.length) {
            sumWhile += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            i++;
        }
        System.out.println("Сумма (do while): " + sumDo);
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}
