import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        //System.out.println("You entered: " + name);

        //int age = SafeInput.getInt(in, "Enter your age");
        //System.out.println("You entered: " + age);

        //double value = SafeInput.getDouble(in, "Enter any double value");
        //System.out.println("You entered: " + value);

        //int age = SafeInput.getRangedInt(in, "Enter your age", 18, 100);
        //System.out.println("You entered: " + age);

        //double grade = SafeInput.getRangedDouble(in, "Enter your grade", 0, 100);
        //System.out.println("You entered: " + grade);

        //boolean answer = SafeInput.getYNConfirm(in, "Do you want to continue?");
        //System.out.println("You answered: " + answer);

        //String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)" , "^\\d{3}-\\d{2}-\\d{4}$");
        //System.out.println("You entered: " + ssn);

        //String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M#####)", "^(M|m)\\d{5}$");
        //System.out.println("You entered: " + mNumber);

        String menu = SafeInput.getRegExString(in, "Enter menu choice [O,S,V,Q]", "^[OoSsVvQq]$");
        System.out.println("You entered: " + menu);






    }
}
