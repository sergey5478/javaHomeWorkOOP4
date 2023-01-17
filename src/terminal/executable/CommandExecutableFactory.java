package terminal.executable;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.Formular;

import java.util.Collections;

public class CommandExecutableFactory {
    public CommandExecutable create(String input) {
        Student student = new Formular(Collections.singletonList(input)).createStudent();
        if (input.equals("/add") && student != null) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), student);
        } else if (input.equals("/delete") && student != null) {
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()), student);
        } else return new BadCommandExecutable();
    }
}
