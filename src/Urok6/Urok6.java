package Urok6;

public class Urok6 {
    public static void main(String[] args) {
        Animal[] animal = {new Dog(500, 0.5f,150), new Cat(150, 2, 3)};
        System.out.println(animal[0].run(800));
        System.out.println(animal[1].run(100));
    }
}
