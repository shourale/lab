package block_2.practice13;

public class ex_2 {
    public static void main(String[] args){
        Person[] people={
            new Person("Insaf","Khusainov","Ilgizovich"),
            new Person("Insaf","Khusainov",""),
            new Person(null,"Khusainov","Ilgizovich"),
            new Person("","Khusainov",null)
        };
        for (Person person:people) System.out.println(person.getFIO());
    }
}
