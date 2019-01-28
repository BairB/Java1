package Urok7;

import java.util.ArrayList;
import java.util.Random;

public class Urok7 {
    public static void main(String[] args) {
        Random random = new Random();
        Cat[] cats = new Cat[5];
        ArrayList<String> catname = new ArrayList<>();
        catname.add("vasya");
        catname.add("kesha");
        catname.add("barsik");
        catname.add("mursik");
        catname.add("leopold");
        for(int i = 0; i < cats.length; i++ ) {
            cats[i] = new Cat(catname.get(i), random.nextInt(11));
        }
        Tarelka tarelka = new Tarelka(100);
        System.out.println(tarelka.obem());
    }
}
