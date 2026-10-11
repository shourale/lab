package q.practice2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        try {
            System.out.print("Количество компьютеров: ");
            int count = Integer.parseInt(scanner.nextLine());
            if (count < 0) throw new IllegalArgumentException("Количество не может быть отрицательным");
            for (int i = 0; i < count; i++) {
                System.out.print("Модель: ");
                String model = scanner.nextLine();
                System.out.print("Цена в рублях (целое число): ");
                shop.addComputer(new Computer(model, Integer.parseInt(scanner.nextLine())));
            }
            while (true) {
                System.out.println("1 — добавить, 2 — удалить, 3 — найти, 4 — список, 0 — выход");
                String command = scanner.nextLine();
                switch (command) {
                    case "0": return;
                    case "1":
                        System.out.print("Модель: ");
                        String model = scanner.nextLine();
                        System.out.print("Цена: ");
                        shop.addComputer(new Computer(model, Integer.parseInt(scanner.nextLine())));
                        break;
                    case "2":
                        System.out.print("Модель: ");
                        System.out.println(shop.removeComputer(scanner.nextLine()) ? "Удалён" : "Не найден");
                        break;
                    case "3":
                        System.out.print("Модель: ");
                        Computer found = shop.findComputer(scanner.nextLine());
                        System.out.println(found == null ? "Не найден" : found);
                        break;
                    case "4":
                        for (Computer computer : shop.getComputers()) System.out.println(computer);
                        break;
                    default: System.out.println("Неизвестная команда");
                }
            }
        } catch (IllegalArgumentException | java.util.NoSuchElementException error) {
            System.out.println("Ошибка ввода: " + error.getMessage());
        }
    }
}
