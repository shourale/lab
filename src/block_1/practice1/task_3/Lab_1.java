package block_1.practice1.task_3;

public class Lab_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + (double) sum / numbers.length);
    }
}
