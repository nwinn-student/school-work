
/**
 * Tests the NanException class to make sure that it functions as intended 
 * using the quadratic equation.
 *
 * @author Noah Winn
 * @id qwx746
 * @version 3/31/2022
 */

import java.util.Scanner;
public class NanExceptionTester{
    public static void main(String [] args){
        try{
            int a;
            int b;
            int c;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value of a: ");
            a = scan.nextInt();
            System.out.println("Enter the value of b: ");
            b = scan.nextInt();
            System.out.println("Enter the value of c: ");
            c = scan.nextInt();
        
            double x1 = 0;
            double x2 = 0; 
            double check = (b*b) - 4*a*c;
            //Throws the exception since check can not be negative.
            if(check < 0){
                throw new NanException("Error: Cannot Square Root a Negative Number.");
            }
            else{
                x1 = ((-b - Math.sqrt(check)) / 2*a);
                x2 = ((-b + Math.sqrt(check)) / 2*a);
                System.out.println("X = " + x1);
                System.out.println("X = " + x2);
            }
        }
         catch(ArithmeticException e){
            e = new NanException("Error: Cannot Square Root a Negative Number.");
            System.out.println(e.getMessage());
        }
    }
}
