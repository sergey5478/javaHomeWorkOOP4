package data.user;

import java.util.List;

public class Teacher extends User{
    private String kafedra;
    private List<Integer> groups;

    public Teacher(String fio, int age, Integer passport, String kafedra, List<Integer> groups) {
        super(fio, age, passport);
        this.kafedra = kafedra;
        this.groups = groups;
    }

    public String getKafedra() {
        return kafedra;
    }
    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }
    public void setGroups(List<Integer> groups) {
        this.groups = groups;
    }
    public List<Integer> getGroups() {
        return groups;
    }
}
