import java.util.Scanner;

public class Urok1 {
    public static void main(String[] args) {
        int a, b, c, d;
        String e;
        Urok1 u = new Urok1();
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Введите А");
        a = scanner.nextInt();
        System.out.println("Введите B");
        b = scanner.nextInt();
        System.out.println("Введите C");
        c = scanner.nextInt();
        System.out.println("Введите D");
        d = scanner.nextInt();
        System.out.println("введите Имя");
        e = scanner.next();
        System.out.println(u.metod1(a, b, c, d));
        System.out.println(u.metod2(a, b));
        System.out.println(u.metod3(a));
        System.out.println(u.metod4(a));
        u.metod5(e);
        u.metod6(400);
    }
    public float metod1(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public boolean metod2(int a, int b) {
        int s = a + b;
        if(s >= 10 && s <= 20) {
           return true;
        }
        else {
            return false;
        }
    }
    public String metod3(int a){
        if(a >= 0){
            return "положительное";
        }
        else {
            return "отричательное";
        }
    }
    public String metod4(int a){
        if(a < 0){
            return "отричательное";
        }
        else {
            return "положительное";
        }
    }
    public void metod5(String e) {
        System.out.println("Privet " + e);
    }
    public void metod6(int a) {
        if( a % 4 == 0 || a % 400 == 0 && a % 100 != 0) {
            System.out.println("высоскосный");
        }
        else {
            System.out.println("НЕТ");
        }
    }
}
