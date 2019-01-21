import java.util.Random;

public class Urok5 {
    public static void main(String[] args) {
        Random random = new Random();
        Person[] persArr = new Person[5];
        persArr[0] = new Person("Ivan", "vrach", "vanya@mail.ru", 112233, 46, 500);
        persArr[1] = new Person("Petr", "ment", "petr@mail.ru", 223344, 30, 600);
        persArr[2] = new Person("Vasya", "buh", "vasya@mail.ru", 112233, 44, 700);
        persArr[3] = new Person("Kolya", "manager", "kolya@mail.ru", 112233, 24, 800);
        persArr[4] = new Person("Dima", "program", "dima@mail.ru", 112233, 34, 900);

        for(int i = 0; i < persArr.length; i++) {
        }
    }
}

class Person{
    private String fio, dolzhnost, email;
    private int telephone, age, zarplata;

    public Person(String f, String d, String e, int t, int a, int z) {
        this.fio = f;
        this.dolzhnost = d;
        this.email = e;
        this.telephone = t;
        this.age = a;
        this.zarplata = z;
    }
}
