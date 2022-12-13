package Lesson9;

public class Date {

    public final int birthDay;
    public final int birthMonth;
    public final int birthYear;

    public Date(int birthDay, int birthMonth, int birthYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Date{" +
                "birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                ", birthYear=" + birthYear +
                '}';
    }

    public int getBirthYear() {
        return birthYear;
    }
}
