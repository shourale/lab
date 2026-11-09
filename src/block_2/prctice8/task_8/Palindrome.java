package block_2.prctice8.task_8;

public class Palindrome {
    public static boolean pal(String s){
        if (s.length()<2) return true;
        if (s.charAt(0)==s.charAt(s.length()-1)) return pal(s.substring(1,s.length()-1));
        return false;
    }
    public static void main(String[] args){
        String s="ab";
        s=s.toLowerCase();
        boolean k=pal(s);
        if (k) System.out.println("YES");
        else System.out.println("NO");
    }
}
