
/**
 * Tests the calculations class.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/25/21
 */
import java.util.Scanner;
public class CalculationsTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter number: ");
        double num2 = scan.nextDouble();
        Calculations calc = new Calculations(num1, num2);
        calc.CalculateSum();
        calc.CalculateDifference();
        calc.CalculateProduct();
        calc.CalculateQuotient();
        System.out.println("Sum is: " + calc.getSum());
        System.out.println("Difference is: " + calc.getDifference());
        System.out.println("Product is: " + calc.getProduct());
        System.out.println("Quotient is: " + calc.getQuotient());
    }
}
