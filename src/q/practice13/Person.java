package q.practice13;

public class Person {
    private String name;
    private String lastname;
    private String otchestvo;

    public Person(String name,String lastname,String otchestvo){
        this.name=name;
        this.lastname=lastname;
        this.otchestvo=otchestvo;
    }

    public String getFIO(){
        StringBuilder result=new StringBuilder(lastname.trim());
        if (name!=null && !name.isBlank()){
            result.append(" ").append(name.trim().charAt(0)).append('.');
        }
        if (otchestvo!=null && !otchestvo.isBlank()){
            if (name==null || name.isBlank()) result.append(" ");
            result.append(otchestvo.trim().charAt(0)).append('.');
        }
        return result.toString();
    }
}
