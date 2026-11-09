package block_1.practice2.task_4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.print("Количество компьютеров: ");
        int count = scan.nextInt();
        scan.nextLine();
        if (count < 0) {
            System.out.println("Количество не может быть отрицательным");
            return;
        }
        for (int i = 0; i < count; i++) {
            addComputer(scan, shop);
        }
        while (true) {
            System.out.println("1 — добавить, 2 — удалить, 3 — найти, 4 — список, 0 — выход");
            String command = scan.nextLine();
            switch (command) {
                case "0":
                    return;
                case "1":
                    addComputer(scan, shop);
                    break;
                case "2":
                    System.out.print("Модель: ");
                    if (shop.removeComputer(scan.nextLine())) {
                        System.out.println("Удалён");
                    } else {
                        System.out.println("Не найден");
                    }
                    break;
                case "3":
                    System.out.print("Модель: ");
                    Computer found = shop.findComputer(scan.nextLine());
                    if (found == null) {
                        System.out.println("Не найден");
                    } else {
                        System.out.println(found);
                    }
                    break;
                case "4":
                    for (Computer computer : shop.getComputers()) {
                        System.out.println(computer);
                    }
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    public static void addComputer(Scanner scan, Shop shop) {
        System.out.print("Модель: ");
        String model = scan.nextLine().trim();
        System.out.print("Цена: ");
        int price = scan.nextInt();
        scan.nextLine();
        if (model.isEmpty() || price < 0) {
            System.out.println("Нужны модель и неотрицательная цена");
            return;
        }
        shop.addComputer(new Computer(model, price));
    }
}
