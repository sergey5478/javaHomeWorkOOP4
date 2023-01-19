package data.user;

public abstract class User {
    private String fio;
    private final int age;
    private final int passport;

    public User(String fio, Integer age, Integer passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getPassport() {
        return passport;
    }
}
