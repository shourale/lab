package q.prctice8;

public class invert_number {
    public static int invert(int num,int res){
        if (num/10==0)return res*10+num;
        return invert(num/10,res*10+num%10);

    }
    public static void main (String[] args){
        System.out.println(invert(12,0));
    }
}
