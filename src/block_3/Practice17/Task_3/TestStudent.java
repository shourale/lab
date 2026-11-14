package block_3.Practice17.Task_1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("""
                        1. Добавить студента
                        2. Удалить студента по номеру
                        3. Показать студента по номеру
                        4. Проверить, пуст ли список
                        5. Очистить список
                        0. Выход""");
                System.out.print("Выберите пункт: ");
                try {
                    int choice = Integer.parseInt(scanner.nextLine().trim());
                    switch (choice) {
                        case 1 -> {
                            Student student = new Student();
                            student.readFromConsole(scanner);
                            list.add(student);
                        }
                        case 2 -> {
                            System.out.print("Введите номер студента (с 1): ");
                            int number = Integer.parseInt(scanner.nextLine().trim());
                            if (list.delete(number)) {
                                System.out.println("Студент удалён");
                            } else {
                                System.out.println("Студента с таким номером нет в списке");
                            }
                        }
                        case 3 -> {
                            System.out.print("Введите номер студента (с 1): ");
                            int number = Integer.parseInt(scanner.nextLine().trim());
                            list.printStudent(number);
                        }
                        case 4 -> System.out.println(list.isEmpty() ? "Список пуст" : "В списке есть студенты");
                        case 5 -> {
                            list.empty();
                            System.out.println("Список очищен");
                        }
                        case 0 -> {
                            return;
                        }
                        default -> System.out.println("Такого пункта меню нет");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Нужно ввести целое число");
                } catch (NoSuchElementException e) {
                    return;
                }
            }
        }
    }
}
