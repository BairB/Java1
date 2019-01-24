package Urok7;

public class Urok7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 50);
        Tarelka tarelka = new Tarelka(51);
        System.out.println(cat.eat(tarelka));
        System.out.println(tarelka.obem());
    }
}
