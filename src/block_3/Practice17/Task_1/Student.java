package block_3.Practice17.Task_1;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;
    Student next;

    public void readFromConsole(Scanner scanner) {
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Введите группу: ");
        group = scanner.nextLine();
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
    }
}
