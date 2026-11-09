package block_1.practice41.task_3;

public class TestPerson {
    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Иван Иванов", 20);
        System.out.println(first);
        first.move();
        first.talk();
        System.out.println(second);
        second.move();
        second.talk();
    }
}
