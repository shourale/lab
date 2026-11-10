package block_3.Practice17.Task_1;



public class StudentList {
    private Student head;
    public void add(Student student) {
        if (head == null) {
            head = student;
        }
        else {
            Student current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next = student;
        }
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void empty(){
        head=null;
    }
    public void printStudent(int n){
        Student current =head;
        int counter=1;
        if (n<1) return ;
        while (counter<n&& current!=null){
            counter++;
            current=current.next;
        }
        if (current!=null) current.printInfo();
        else System.out.println("Студента с таким номером нет в списке");

    }
}
