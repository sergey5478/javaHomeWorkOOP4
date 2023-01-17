package terminal.displayed;

public class NoneResultDisplayed implements ResultDisplayed {
    @Override
    public void display() {
        System.out.println("Неправильный ввод данных");
    }
}