package terminal.executable;

import data.user.Student;
import service.user.StudentService;

public class CreateStudentExecutable implements CommandExecutable {
    private final StudentService studentService;
    private Student student;


    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        //this.student = student;
    }

    @Override
    public void execute() {
        studentService.saveStudent(student);
    }
}
