package block_3.Practice17.Task_3;

public class StudentList {
    private Student head;
    private Student tail;

    public StudentList() {
        head = null;
    }

    public void add(Student student) {
        if (head == null) {
            head = student;
        } else {
            tail.next = student;
        }
        tail = student;
        tail.next = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void empty() {
        head = null;
        tail = null;
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
            if (head == tail) {
                empty();
            } else {
                head = head.next;
                tail.next = head;
            }
            return true;
        }

        Student previous = findStudent(number - 1);
        if (previous == null || previous == tail) {
            return false;
        }

        Student student = previous.next;
        previous.next = student.next;
        if (student == tail) {
            tail = previous;
        }
        return true;
    }

    private Student findStudent(int number) {
        if (head == null || number < 1) {
            return null;
        }
        Student current = head;
        for (int position = 1; position < number; position++) {
            if (current.next == head) {
                return null;
            }
            current = current.next;
        }
        return current;
    }
}
