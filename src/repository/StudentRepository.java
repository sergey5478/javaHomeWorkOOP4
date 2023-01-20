package repository;

import data.user.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {
    private StudentTable studentTable;

    public StudentRepository() {
    }

    @Override
    public void save(Student entity) {

    }

    @Override
    public void delete(Student entity) {
        studentTable.removeByName(entity.getFio());
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
