package block_1.practice6.task_3;

public class TestNameable {
    public static void main(String[] args) {
        Nameable[] objects = {new Planet("Земля"), new Animal("Барсик")};
        for (Nameable object : objects) {
            System.out.println(object.getName());
        }
    }
}
