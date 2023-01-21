package terminal.displayed;

public class StudentMenu {
    public static void displayMenu(){
        System.out.println("Для работы со студентом введите команду и данные студента через пробел.");
        System.out.println("Примеры: /add /student Фирсов Руслан Арсеньевич 1980,\n" +
                "         /delete /student Фирсов Руслан Арсеньевич 1980");
    }
}
