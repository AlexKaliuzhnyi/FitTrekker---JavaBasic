package Lesson9;

public class Main {
    public static void main(String[] args) {
        User leon = new User("leon", "Milk",
                new Date(11, 05, 2000),
                new Contacts("lala12@ukr.net", "0391411"),
                new FitInfo(70, "130/160", 6000));
        User john = new User("John", "Lebron ",
                new Date(7, 06, 2003),
                new Contacts("mit_ol@gmail.com", "052563"),
                new FitInfo(140, "120/150", 4500));
        User bob = new User("Bob", "Lime",
                new Date(19, 10, 1984),
                new Contacts("lime4ik@ukr.net", "0411552"),
                new FitInfo(70, "130/160", 6000));

        System.out.println(leon);
        System.out.println(john);
        System.out.println(bob);

    }
}
