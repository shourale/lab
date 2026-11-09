package block_2.prctice8;

public class without_two_zeros {
    public static int counter(int zeros,int ones, boolean lastzero){
        int result=0;
        if (zeros == 0 && ones == 0) return 1;
        if (ones>0) result+= counter(zeros,ones-1,false);
        if (zeros>0 && !lastzero) result+= counter(zeros-1,ones,  true);
        return result;
    }
    public static void main(String[] args){
        System.out.println(counter(1,2,false));
    }
}
