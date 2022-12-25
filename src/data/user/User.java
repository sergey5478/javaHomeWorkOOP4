package data.user;

public abstract class User {
    private String fio;
    private int age;
    private String passport;

    public User(String fio, int age, String passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }
}
