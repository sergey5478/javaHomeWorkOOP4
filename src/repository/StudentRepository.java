package repository;

import data.user.Student;
import db.StudentTable;

import java.util.List;

public class StudentRepository implements Repository<Student> {
    private final StudentTable studentTable;
    public StudentRepository() {
        this.studentTable = new StudentTable();
    }
    @Override
    public void save(Student entity) {
        studentTable.save(entity);
    }
    @Override
    public void delete(Student entity) {
        studentTable.deleteByFio(entity.getFio());
    }

    public List<Student> getUsersList() {
        return studentTable.getElements();
    }
}