package block_3.Practice17.Task_2;

public class StudentList {
    private Student head;
    private Student tail;
    public StudentList() {
        head = null;
        tail=null;
    }
    public void add(Student student) {
        if (head == null) {
            head = student;
            tail=student;
            return;
        }

        else{
            tail.next=student;
            student.prev=tail;
            tail=student;
        }

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
        if (head == null || tail == null || number < 1) {
            return false;
        }
        if (number == 1) {
            head = head.next;
            head.prev=null;
            return true;
        }
        Student previous = findStudent(number - 1);
        previous.next = previous.next.next;
        if (previous.next != null) {
            previous.next.prev = previous;
        }
        else {
            tail = previous;
        }
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
