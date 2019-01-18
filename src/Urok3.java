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

        do {
            int i = 0;
            while (i < p) {
                System.out.println("vvedite chislo");
                int z = scanner.nextInt();
                if (x == z) {
                    System.out.println("ugadal");
                    break;
                }
                else {
                    System.out.println("Your number is " + ((x > z)?"greater" : "less."));
                    i++;
                }
            }
            if(i == 3){
                System.out.println("You lost!");
            }
            System.out.print("Repeat the game?\n[1 - yes / 0 - no]: ");
        }
        while (scanner.next().equals("1"));
    }
}
