
/**
 * Checks to see if float value are close enough to be considered equal
 * (5 decimal places).
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
import java.util.Scanner;
public class FloatChecker5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Number 1: ");
        float num1 = scan.nextFloat();
        System.out.println("Enter Number 2: ");
        float num2 = scan.nextFloat();
        num1 = Math.round(num1 * 100000);
        num2 = Math.round(num2 * 100000);
        
        if(num1 == num2){
            System.out.println("The float values match up to 5 decimals.");
        }
    }
}
