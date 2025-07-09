import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "Enter your favourite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favourite double");
        System.out.println("Your favourite integer: " + favInt);
        System.out.println("Your favourite double: " + favDouble);

    }
}
