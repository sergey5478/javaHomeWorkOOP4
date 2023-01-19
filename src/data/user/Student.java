package data.user;

public class Student extends User implements Comparable<Student> {
    private int groupNumber;

    public Student(String fio, Integer yearOfBirth, Integer passportNumber, Integer groupNumber) {
        super(fio, yearOfBirth, passportNumber);
        this.groupNumber = groupNumber;
    }


    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public int compareTo(Student student) {
        if (student.getAge() < this.getAge()) return 1;
        if (student.getAge() > this.getAge()) return -1;
        return 0;
    }
}
