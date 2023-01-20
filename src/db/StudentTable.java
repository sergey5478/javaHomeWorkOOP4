package db;
import data.user.Student;

public class StudentTable extends Table<Student> {
    public boolean removeByName(String name) {
        for (Student student : elements) {
            if (student.getFio().equals(student.getFio())) {
                elements.remove(student);
                return true;
            }
        }
        return false;
    }

}
