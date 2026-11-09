package q.practice9_10;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Student {
    private Date birthDate;
    private int id;
    private String name;
    private String lastname;
    private int score;
    private String spec;
    private int year;
    private String group;

    public String formatStudentDateBirth(String pattern){
        SimpleDateFormat f=new SimpleDateFormat(pattern);
        return f.format(birthDate);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSpec() {
        return spec;
    }

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    public Student(int id, String name, String lastname, String spec, int year, String group, int score,Date birthDate) {
        this.id = id;
        this.group = group;
        this.name = name;
        this.lastname = lastname;
        this.score = score;
        this.year = year;
        this.spec = spec;
        this.birthDate=birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getScore() {
        return score;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID " + id + " name: " + name + " " + lastname + " Specialisation: " + spec + " Year: " + year + " Group: " + group + " Score:  " + score + " Birth date: " + formatStudentDateBirth("dd.MM.yyyy");
    }
}
