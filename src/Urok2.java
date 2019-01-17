import java.util.Arrays;
import java.util.Random;

public class Urok2 {
    Random random = new Random();
    Integer[] a = new Integer[10];
    Integer[] b = new Integer[8];
    Integer[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    Integer[][] d = new Integer[3][3];
    static Urok2 u = new Urok2();
    public static void main(String[] args) {
        u.zadacha1();
        u.zadacha2();
        u.zadacha3();
        u.zadacha4();
        u.zadacha5();
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
    public Integer zamena2(int x) {
        if(x < 6) {
            return x*2;
        }
        else {
            return x;
        }
    }
    public void zadacha5() {
        for(int i = 0; i < a.length; i++){
            a[i] = u.zapoln(15);
            System.out.print(" " + a[i]);
        }
        int m = a[0];
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > m){
                m = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(" max= " + m + " min= " + min);
    }
    public void zadacha4() {
        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d.length; j++) {
                d[i][j] = 0;
            }
        }
        for(int i = 0; i < d.length; i++) {
            System.out.println(" ");
            for(int j = 0; j < d.length; j++) {
                System.out.print(d[i][j]);
            }
        }
        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d.length; j++) {
                if(i == j){
                    d[i][j] = 1;
                }
            }
        }
        System.out.println(" ");
        for(int i = 0; i < d.length; i++) {
            System.out.println(" ");
            for(int j = 0; j < d.length; j++) {
                System.out.print(d[i][j]);
            }
        }
        System.out.println(" ");
    }
    public void zadacha3() {
        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
        }
        for(int i = 0; i < c.length; i++){
            c[i] = u.zamena2(c[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
        }
        System.out.println(" ");
    }
    public void zadacha2() {
        System.out.println(" ");
        b[0] = 0;
        for(int i = 1; i < b.length; i++){
            b[i] = b[i - 1] + 3;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.println(" ");
    }
    public void zadacha1() {
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
    }
}
