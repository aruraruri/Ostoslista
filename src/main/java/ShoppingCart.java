import java.util.Scanner;

public class ShoppingCart {
    static double total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eggAmt = 0;
        double eggPrice = 0.0;
        System.out.println("Enter amount of eggs");
        eggAmt = sc.nextInt();
        System.out.println("Enter price of eggs");
        eggPrice = sc.nextDouble();

        int sockAmt = 0;
        double sockPrice = 0.0;
        System.out.println("Enter amount of socks");
        sockAmt = sc.nextInt();
        System.out.println("Enter price of socks");
        sockPrice = sc.nextDouble();

        total = total + ((eggAmt*eggPrice) + (sockAmt*sockPrice));

        System.out.println("Total price of shoppings is: "+total);

    }
}
