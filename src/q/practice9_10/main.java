package q.practice9;

public class main {
    public static void main(String[] args) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student st1 = new Student(7, "Grishanya","Fedin" ,"Physics",5,"1-2021-1",10);
        Student st2 = new Student(3, "Vovan", "Privetov","IT",4,"2-2022-1",14);
        Student st3 = new Student(5, "Sanya", "Medvedov","Literature",2,"3-2024-4",9);
        Student st4 = new Student(2, "madk1d","Markov" ,"Temwik",2,"4-2024-3",6);

        Student[] students = {st1, st2, st3, st4};
        insertionSort(students);
        comparator.setArray(students);
        comparator.mergeSort();
        comparator.quicksort();
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
