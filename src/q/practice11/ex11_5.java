package q.practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex11_5 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        LinkedList<Integer> linked=new LinkedList<>();

        int size=20000;
        int count=1000;
        long start;
        long arraytime;
        long linkedtime;

        start=System.nanoTime();
        for (int i=0;i<size;i++){
            array.add(i);
        }
        arraytime=System.nanoTime()-start;

        start=System.nanoTime();
        for (int i=0;i<size;i++){
            linked.add(i);
        }
        linkedtime=System.nanoTime()-start;

        System.out.println("Добавление в конец:");
        System.out.println("ArrayList: "+arraytime+" нс");
        System.out.println("LinkedList: "+linkedtime+" нс");

        start=System.nanoTime();
        for (int i=0;i<count;i++){
            array.add(0,i);
        }
        arraytime=System.nanoTime()-start;

        start=System.nanoTime();
        for (int i=0;i<count;i++){
            linked.add(0,i);
        }
        linkedtime=System.nanoTime()-start;

        System.out.println("Вставка в начало:");
        System.out.println("ArrayList: "+arraytime+" нс");
        System.out.println("LinkedList: "+linkedtime+" нс");

        array.clear();
        linked.clear();
        for (int i=0;i<size;i++){
            array.add(i);
            linked.add(i);
        }

        start=System.nanoTime();
        for (int i=0;i<count;i++){
            array.remove(0);
        }
        arraytime=System.nanoTime()-start;

        start=System.nanoTime();
        for (int i=0;i<count;i++){
            linked.remove(0);
        }
        linkedtime=System.nanoTime()-start;

        System.out.println("Удаление из начала:");
        System.out.println("ArrayList: "+arraytime+" нс");
        System.out.println("LinkedList: "+linkedtime+" нс");

        array.clear();
        linked.clear();
        for (int i=0;i<size;i++){
            array.add(i);
            linked.add(i);
        }

        int arrayfound=0;
        int linkedfound=0;

        start=System.nanoTime();
        for (int i=0;i<count;i++){
            if (array.contains(size-1-i)) arrayfound++;
        }
        arraytime=System.nanoTime()-start;

        start=System.nanoTime();
        for (int i=0;i<count;i++){
            if (linked.contains(size-1-i)) linkedfound++;
        }
        linkedtime=System.nanoTime()-start;

        System.out.println("Поиск по значению:");
        System.out.println("ArrayList: "+arraytime+" нс");
        System.out.println("LinkedList: "+linkedtime+" нс");
        System.out.println("Найдено в ArrayList: "+arrayfound);
        System.out.println("Найдено в LinkedList: "+linkedfound);
    }
}