package practice9_10;

import java.util.Comparator;

public class SortingStudentsByLastName implements Comparator<Student> {
    @Override
    public int compare(Student a,Student b){
        return a.getLastname().compareTo(b.getLastname());
    }
}
