import java.util.Scanner;

public class menu{
    Scanner in = new Scanner(System.in);
    int x = 0;
    int y = 0;

   public void showMenu() {

        System.out.println("==========================");
        System.out.println("Przelicznik walut");
        System.out.println("==========================");
        System.out.println("");

        System.out.println("1. PLN");
        System.out.println("2. USD");
        System.out.println("3. GBP");
        System.out.println("4. EUR");
        System.out.println("5. CHF");

        while ((x != 1) && ( x != 2) && (x != 3) && (x != 4) && (x != 5)){
            System.out.println("Wybierz walute: ");
            x = in.nextInt();
        }

        while ((y != 1) && (y != 2) && (y != 3) && (y!= 4) && (y != 5)){
            System.out.println("Przelicz na: ");
            y = in.nextInt();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
