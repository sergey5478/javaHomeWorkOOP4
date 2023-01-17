package terminal.executable;

import data.user.Student;
import repository.StudentRepository;
import service.user.StudentService;
import terminal.Command;
import terminal.Formular;

import java.util.Collections;
import java.util.List;

public class CommandExecutableFactory {
    private List<String> getArguments;

    public CommandExecutable create(Command input) {
        Student student = new Formular(getArguments).createStudent();
        if (input.isCreateCommand()) {
            return new CreateStudentExecutable(new StudentService(new StudentRepository()), student);
        } else if (input.isDeleteCommand() ){
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()), student);
        } else return new BadCommandExecutable();
    }
}
