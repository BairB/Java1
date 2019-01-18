import java.util.Random;
import java.util.Scanner;

public class Urok3 {

    public static void main(String[] args) {
        Random random = new Random();
        Urok3 u = new Urok3();
        int x, p;
        p = 3;
        x = random.nextInt(10);
        System.out.println(x);
        u.ugadai(x,p);
    }
    public void ugadai(int x, int p) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < p) {
            System.out.println("vvedite chislo");
            int z = scanner.nextInt();
            if (x == z) {
                System.out.println("ugadal");
                break;
            }
            else if(x > z) {
                System.out.println("загаданное число больше");
                i++;
            }
            else if(x < z) {
                System.out.println("загаданное число меньше");
                i++;
            }
            else {
                System.out.println("ne ugadal");
            }
        }
    }
}
