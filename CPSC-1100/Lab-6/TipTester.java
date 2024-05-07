
/**
 * After inputting the cost, calculates the tip and sums it with the cost.
 * Outputs the satisfaction rate, cost, tip, and total cost.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
import java.util.Scanner;
public class TipTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //asks user for information
        System.out.println("Enter the cost of the meal: ");
        double bill = scan.nextDouble();
        System.out.println("Enter satisfaction rating (1: Totally Satisfied, 2: Satisfied, 3: Dissatisfied): ");
        int satRating = scan.nextInt();
        //creates a new object
        Tip t0 = new Tip(satRating);
        
        double totalMeal = bill + t0.CalcTip(bill);
        //output
        if(satRating == 1){
            System.out.println("Satisfaction Level: Very Satisfied.");
        }
        if(satRating == 2){
            System.out.println("Satisfaction Level: Satisfied.");
        }
        if(satRating == 3){
            System.out.println("Satisfaction Level: Dissatisfied.");
        }
        System.out.println("Meal Cost: " + bill);
        System.out.println("Tip Amount: " + t0.CalcTip(bill));
        System.out.println("Total Cost: " + totalMeal);
        
    }
}
