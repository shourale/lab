package block_2.practice13.task_1;


public class ex_1 {
    public static void main(String[] args){
        processString("I like Java!!!");
    }
    public static void processString(String s) {
        if (!s.isEmpty()) System.out.println("Last char: "+s.charAt(s.length()-1));
        else System.out.println("String is empty");
        if (s.endsWith("!!!")) System.out.println("String ends with !!!");
        else System.out.println("String doesn't end with !!!");
        if (s.startsWith("I like")) System.out.println("String starts with \"I like\"");
        else System.out.println("String doesn't start with \"I like\"");
        if (s.contains("Java")) System.out.println("String contains \"Java\"");
        else System.out.println("String doesn't contain \"Java\"");
        if (s.contains("Java")) System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        int pos = s.indexOf("Java");
        if (pos != -1) {
            System.out.println(s.substring(pos, pos + 4));
        }
    }
}
