import java.util.Arrays;
import java.util.Random;

public class Urok2 {
    Random random = new Random();
    static Integer[] a = new Integer[10];
    static Integer[] b = new Integer[8];
    static Urok2 u = new Urok2();
    public static void main(String[] args) {
        for(int i = 0; i < a.length; i++){
            a[i] = u.zapoln(2);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            a[i] = u.zamena(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        //задача 2
        System.out.println(" ");
        b[0] = 0;
        for(int i = 1; i < b.length; i++){
            b[i] = b[i - 1] + 3;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.println(" ");
        //Задача 3
        for(int i = 0; i < b.length; i++){
            b[i] = u.zapoln(11);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
    }
    public Integer zapoln(int x) {
        int b = random.nextInt(x);
        return b;
    }
    public Integer zamena(int x) {
        if(x == 1) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
