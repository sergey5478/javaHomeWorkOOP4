package terminal.executable;

import terminal.Command;

public class LogingCommandExecutableFactory extends CommandExecutableFactory {

    public LogingCommandExecutableFactory(){
        super();
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println("Loggin");
        return result;
    }
}