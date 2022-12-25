package data.group;

import data.user.User;

import java.util.List;

public class TeacherGroup extends UserGroup implements Comparable<TeacherGroup> {
    private final String kafedra;

    public TeacherGroup(List<User> teachers, String kafedra) {
        super(teachers);
        this.kafedra = kafedra;
    }

    public String getKafedra() {
        return kafedra;
    }

    @Override
    public int compareTo(TeacherGroup tg) {
        return Integer.compare(this.getUsers().size(), tg.getUsers().size());
    }
}