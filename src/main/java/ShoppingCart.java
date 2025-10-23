import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    static double total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask lang
        System.out.println("Enter language: ");
        String lang = sc.nextLine();
        System.out.println("Enter country: ");
        String country = sc.nextLine();
        Locale locale = new Locale(lang, country);
        ResourceBundle messagesBundle = ResourceBundle.getBundle("MessagesBundle", locale);


        int eggAmt = 0;
        double eggPrice = 0.0;
        System.out.println(messagesBundle.getString("prompt.eggAmt"));
        eggAmt = sc.nextInt();
        System.out.println(messagesBundle.getString("prompt.eggPrice"));
        eggPrice = sc.nextDouble();

        int sockAmt = 0;
        double sockPrice = 0.0;
        System.out.println(messagesBundle.getString("prompt.sockAmt"));
        sockAmt = sc.nextInt();
        System.out.println(messagesBundle.getString("prompt.sockPrice"));
        sockPrice = sc.nextDouble();

        total = total + ((eggAmt*eggPrice) + (sockAmt*sockPrice));

        System.out.println("Total price of shoppings is: "+total);

    }
}
