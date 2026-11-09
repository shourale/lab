package practice9_10;
import java.text.SimpleDateFormat;
public class main {
    public static void main(String[] args) throws java.text.ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
        f.setLenient(false);
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student st1 = new Student(7, "Grishanya", "Fedin", "Physics",
                5, "1-2021-1", 10, f.parse("15.01.2003"));

        Student st2 = new Student(3, "Vovan", "Privetov", "IT",
                4, "2-2022-1", 14, f.parse("22.06.2004"));

        Student st3 = new Student(5, "Sanya", "Medvedov", "Literature",
                2, "3-2024-4", 9, f.parse("03.09.2006"));

        Student st4 = new Student(2, "madk1d", "Markov", "Temwik",
                2, "4-2024-3", 6, f.parse("11.04.2006"));

        Student st5 = new Student(8, "Ivan", "Petrov", "IT",
                2, "IKBO-12-25", 12, f.parse("27.12.2006"));

        Student st6 = new Student(9, "Anna", "Sokolova", "Physics",
                3, "FIZ-03-24", 8, f.parse("08.08.2005"));
        System.out.println(st1.formatStudentDateBirth("dd.MM.yy"));
        System.out.println(st1.formatStudentDateBirth("dd MMM yyyy"));
        System.out.println(st1.formatStudentDateBirth("dd MMMM yyyy"));
        Student[] second = {st5, st6};
        Student[] students = {st1, st2, st3, st4};
        Student[] result = comparator.merge(
                comparator.mergeSort(students),
                comparator.mergeSort(second)
        );
        comparator.setArray(result);
        comparator.outArray();
        System.out.println(' ');
//        insertionSort(students);
        comparator.setArray(students);

//        comparator.mergeSort();
//        comparator.quicksort();
//        comparator.outArray();
//        comparator.quicksort(new SortingStudentsByLastName());
        comparator.outArray();
    }
    public static void insertionSort(Student[] students) {
        for (int i=1; i<students.length;i++){
            int j=i-1;
            Student current=students[i];
            while (j>=0 && students[j].getId()>current.getId()){
                students[j+1]=students[j];
                j-=1;
            }
            students[j+1]=current;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
