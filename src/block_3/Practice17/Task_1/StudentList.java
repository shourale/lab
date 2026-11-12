package block_3.Practice17.Task_1;

public class StudentList {
    private Student head;

    public StudentList() {
        head = null;
    }

    public void add(Student student) {
        if (head == null) {
            head = student;
            return;
        }

        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = student;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void empty() {
        head = null;
    }

    public void printStudent(int number) {
        Student student = findStudent(number);
        if (student == null) {
            System.out.println("Студента с таким номером нет в списке");
        } else {
            student.printInfo();
        }
    }

    public boolean delete(int number) {
        if (head == null || number < 1) {
            return false;
        }
        if (number == 1) {
            head = head.next;
            return true;
        }

        Student previous = findStudent(number - 1);
        if (previous == null || previous.next == null) {
            return false;
        }
        previous.next = previous.next.next;
        return true;
    }

    private Student findStudent(int number) {
        if (number < 1) {
            return null;
        }
        Student current = head;
        for (int position = 1; position < number && current != null; position++) {
            current = current.next;
        }
        return current;
    }
}
