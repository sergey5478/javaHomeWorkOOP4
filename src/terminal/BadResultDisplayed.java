package terminal;

public class BadResultDisplayed implements ResultDisplayed {
    @Override
    public void display() {
        System.out.println("Неправильный ввод!");
    }
}
