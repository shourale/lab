package block_2.practice9_10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] iDNumber;
    public void setArray(Student[] students){
        iDNumber=students;
    }
    public void outArray(){
        for (Student i: iDNumber){
            System.out.println(i);
        }
    }
    @Override
    public int compare(Student a,Student b){
        if (a.getScore()>b.getScore()) return -1;
        else if (a.getScore()==b.getScore()) {
            return 0;
        }
        else return 1;
    }
    public Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j<right.length){
            if (compare(left[i],right[j])<=0){
                result[k]=left[i];
                i++;
            }
            else{ result[k]=right[j];
            j++;
        }k++;
        }
        while (i< left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
    public Student[] mergeSort(Student[] s){
        if (s.length<=1) return s;
        int mid=s.length/2;
        Student[] a= Arrays.copyOfRange(s,0,mid);
        Student[] b=Arrays.copyOfRange(s,mid,s.length);
        a=mergeSort(a);
        b=mergeSort(b);
        return merge(a,b);
    }
    public void quicksort(Student[] students,int left,int right,Comparator<Student> order){
        if (left>=right) return;
        int pos=left;
        Student oporniy=students[right];
        for (int i=left; i<right;i++){
            if (order.compare(students[i],oporniy)<0){
                Student temp=students[pos];
                students[pos]=students[i];
                students[i]=temp;
                pos++;
            }
        }
        Student temp=students[pos];
        students[pos]=students[right];
        students[right]=temp;
        quicksort(students,left,pos-1,order);
        quicksort(students,pos+1,right,order);
    }
    public void quicksort(Comparator<Student> order){
        quicksort(iDNumber,0,iDNumber.length-1,order);
    }
    public void quicksort(){
        quicksort(iDNumber,0,iDNumber.length-1,this);}
    public void mergeSort(){
        iDNumber=mergeSort(iDNumber);
    }
}
