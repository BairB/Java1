import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Urok3 {
    Random random1 = new Random();
    public static void main(String[] args) {
        Random random = new Random();
        Urok3 u = new Urok3();
        int x, p;
        p = 3;
        x = random.nextInt(10);
        /*System.out.println(x);
        u.ugadai(x,p);*/
        u.slovo();
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
    public void slovo(){
        Scanner sc = new Scanner(System.in);
        String x;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        String z = words[random1.nextInt(words.length)];
        System.out.println(z);
        do {
            System.out.print("Guess the word: ");
            x = sc.next();
            for (int i = 0; i < 15; i++)
                if (i < z.length() && i < x.length() &&
                        z.charAt(i) == x.charAt(i))
                    System.out.print(z.charAt(i));
                else
                    System.out.print((z.equals(x))? "" : "#");
            System.out.println();
        } while (!z.equals(x));
    }
}
