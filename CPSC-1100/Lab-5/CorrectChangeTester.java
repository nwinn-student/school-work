
/**
 * Outputs amount of change after calculating how many quarters, dimes, nickels,
 * and cents.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/30/21
 */
import java.util.Scanner;
public class CorrectChangeTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int quarters;
        int dimes;
        int nickels;
        int cents;
        int input;
        
        System.out.println("Enter cents to return to customer: ");
        input = scan.nextInt();
        
        quarters = input / 25;
        input = input % 25;
        
        dimes = input / 10;
        input = input % 10;
        
        nickels = input / 5;
        input = input % 5;
        
        cents = input / 1;
        input = input % 1;
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Cents: " + cents);
    }
}
