package Lesson9;

public class User {
    private final String name;
    private final String surname;


    private  Date birthDay;
    private Contacts contact;
    private FitInfo fitInfo;
    private int age;

    public User(String name, String surname, Date birthDay, Contacts contact, FitInfo fitInfo) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.contact = contact;
        this.fitInfo = fitInfo;
        this.age = 2020 - birthDay.getBirthYear();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay=" + birthDay +
                ", contact=" + contact +
                ", fitInfo=" + fitInfo +
                ", age=" + age +
                '}';
    }
}

