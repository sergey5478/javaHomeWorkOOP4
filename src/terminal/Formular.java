package terminal;

import data.user.Student;
import java.util.List;

public class Formular {
    private final List<String> commands;

    public Formular(List<String> commands) {
        this.commands = commands;
    }

    private boolean isInput(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private String formName() {
        String fio = null;
        for (int i = 1; i < commands.size(); i++) {
            if (!isInput(commands.get(i)) && commands.size() - i > 2 &&
                    !isInput(commands.get(i + 1)) && !isInput(commands.get(i + 2))) {
                fio = String.join(" ", commands.get(i), commands.get(i + 1), commands.get(i + 2));
                commands.remove(commands.get(i));
                commands.remove(commands.get(i + 1));
                commands.remove(commands.get(i + 2));
                break;
            }
        }
        return fio;
    }


    private Integer formYearOfBirth() {
        Integer age = null;
        for (String i : commands) {
            if (isInput(i) && i.length() == 4) {
                age = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return age;
    }

    private Integer formPassNumber() {
        Integer passport = null;
        for (String i : commands) {
            if (isInput(i) && i.length() == 10) {
                passport = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return passport;
    }

    private Integer formGroupNumber() {
        Integer groupNumber = null;
        for (String i : commands) {
            if (isInput(i)) {
                groupNumber = Integer.parseInt(i);
                commands.remove(i);
                break;
            }
        }
        return groupNumber;
    }

    public Student createStudent() {
        int lengthBefore = commands.size();
        String fio = formName();
        int age = formYearOfBirth();
        int passport = formPassNumber();
        int groupNumber = formGroupNumber();
        if (lengthBefore < commands.size())
            return new Student(fio, age, passport, groupNumber);
        else return null;
    }
}
