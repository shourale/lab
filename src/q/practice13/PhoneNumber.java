package q.practice13;

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number){
        if (number.startsWith("8")){
            number="+7"+number.substring(1);
        }
        this.number=number;
    }

    @Override
    public String toString(){
        int start=number.length()-10;
        return number.substring(0,start)+number.substring(start,start+3)+"-"
                +number.substring(start+3,start+6)+"-"+number.substring(start+6);
    }
}
