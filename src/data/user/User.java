package data.user;

public abstract class User {
    private String fio;
    private int age;
    private Integer passport;
    public User(String fio){
        this.fio = fio;
    }

    public User(String fio, int age, Integer passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public void setFio(String fio){
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }
}
