package q.prctice8;

public class count_ones {
    public static int readNumber() throws java.io.IOException {
        return Integer.parseInt(new java.util.Scanner(System.in).nextLine());
    }

    public static int countOnes() throws java.io.IOException {
        int number = readNumber();
        if (number==0){
            number=readNumber();
            if (number==0) return 0;
        }
        if (number==1) return 1+countOnes();
        return countOnes();
    }

    public static void main(String[] args) throws java.io.IOException {
        System.out.println(countOnes());
    }

}
