import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        boolean moreItems;

        do {
            double price = SafeInput.getRangedDouble(in, "Enter your price", 0.5, 10.0);
            total += price;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (moreItems);
        System.out.printf("Your total price is $%.2f\n", total);
    }
}
