
/**
 * Purpose: Allows user to input values to calculate total cost
 *
 * @author Noah Winn
 * @ID QWX746
 * @ Lab3
 * @version 9/14/2021
 */
import java.util.Scanner;
public class SalesTaxTester
{
    public static void main(String[] args){
        double tax = .1;
        double purchase;
        double cost;
        
        SalesTax test = new SalesTax(tax);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the price of the good.");
        purchase = scan.nextDouble();
        
        test.calculateSalesTax(purchase);
        test.totalCost();
        cost = test.getTotalCost();
        System.out.println("The total cost is " + cost);
    }
}
