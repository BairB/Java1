package Urok7;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Graphics;

public class Urok7 {
    public static void main(String[] args) {
        Random random = new Random();

        TarelkaG tarelkaG = new TarelkaG(50, 100);
        CatG[] cats = new CatG[5];
        Forma forma = new Forma();

        ArrayList<String> catname = new ArrayList<>();
        catname.add("vasya");
        catname.add("kesha");
        catname.add("barsik");
        catname.add("mursik");
        catname.add("leopold");

        for(int i = 0; i < cats.length; i++ ) {
            cats[i] = new CatG(catname.get(i), random.nextInt(11));
        }
    }
}
