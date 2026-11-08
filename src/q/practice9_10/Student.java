package q.practice9;

public class Student {
    private int id;
    private String name;
    private String lastname;
    private int score;
    private String spec;
    private int year;
    private String group;

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

    public Student(int id, String name, String lastname, String spec, int year, String group, int score) {
        this.id = id;
        this.group = group;
        this.name = name;
        this.lastname = lastname;
        this.score = score;
        this.year = year;
        this.spec = spec;
    }

    public int getScore() {
        return score;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID " + id + " name: " + name + " " + lastname + " Specialisation: " + spec + " Year: " + year + " Group: " + group + " Score:  " + score;
    }
}
