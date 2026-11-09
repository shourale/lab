package block_2.practice13.task_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите путь к текстовому файлу:");
        String filename=scan.nextLine();
        String text=Files.readString(Path.of(filename)).trim();
        if (text.isEmpty()){
            System.out.println("Файл пустой");
            return;
        }
        String[] words=text.split("\\s+");
        System.out.println(getLine(words));
    }

    public static StringBuilder getLine(String[] words){
        StringBuilder result=new StringBuilder();
        boolean[] used=new boolean[words.length];
        if (build(words,used,result,0)) return result;
        return new StringBuilder("Цепочку составить невозможно");
    }

    private static boolean build(String[] words,boolean[] used,StringBuilder result,int count){
        if (count==words.length) return true;
        for (int i=0;i<words.length;i++){
            if (used[i]) continue;
            if (result.length()>0){
                char last=Character.toLowerCase(result.charAt(result.length()-1));
                char first=Character.toLowerCase(words[i].charAt(0));
                if (last!=first) continue;
            }
            int length=result.length();
            if (length>0) result.append(' ');
            result.append(words[i]);
            used[i]=true;
            if (build(words,used,result,count+1)) return true;
            used[i]=false;
            result.setLength(length);
        }
        return false;
    }
}
