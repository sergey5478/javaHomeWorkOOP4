import service.user.StudentService;
import terminal.TerminalReader;
import terminal.displayed.StudentMenu;
import terminal.executable.factory.LoggingCommandExecutableFactory;
public class Main {
    public static void main(String[] args) {
        StudentMenu.displayMenu();
        TerminalReader.getInstance(new LoggingCommandExecutableFactory(new StudentService())).listenToCommands();
    }
}