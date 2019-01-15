import java.util.Arrays;
import java.util.Random;

public class Urok2 {
    Random random = new Random();
    static Integer[] a = new Integer[10];
    static Urok2 u = new Urok2();
    public static void main(String[] args) {
        for(int i = 0; i < a.length; i++){
            a[i] = u.zapoln();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = u.zamena(a[i]);
        }
        System.out.println("zamena");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public Integer zapoln() {
        int b = random.nextInt(2);
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
