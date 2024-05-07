
/**
 * Purpose: User inputs balances and calculates the 
 *
 * @author Noah Winn
 * @ID QWX746
 * @ Lab 3
 * @version 9/14/2021
 */
import java.util.Scanner;
public class BankAccountTester{
   public static void main(String[] args){
        double bal1;
        double bal2;
        double bal3;
        double rate;
        
        BankAccount test = new BankAccount();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first balance.");
        bal1 = scan.nextDouble();
        System.out.println("Enter the second balance.");
        bal2 = scan.nextDouble();
        System.out.println("Enter the third balance.");
        bal3 = scan.nextDouble();
        System.out.println("Enter the rate: ");
        rate = scan.nextDouble();
        
        rate = (rate/100);
        
        //first balance
        test.deposit(bal1);
        System.out.println("The balance is " + bal1);
        test.addInterest(rate);
        
        System.out.println("The new balance is " + test.getBalance());
        System.out.println("With the interest rate of " + rate + ", the first balance is expected to be "+ ((bal1 * rate) + bal1) ); 
        test.withdraw(bal1);
        // second balance
        test.deposit(bal2);
        System.out.println("The balance is " + bal2);
        test.addInterest(rate);
        
        System.out.println("The new balance is " + test.getBalance());
        System.out.println("With the interest rate of " + rate + ", the second balance is expected to be "+ ((bal2 * rate) + bal2) ); 
        test.withdraw(bal2);
        //third balance
        test.deposit(bal3);
        System.out.println("The balance is " + bal3);
        test.addInterest(rate);
        
        System.out.println("The new balance is " + test.getBalance());
        System.out.println("With the interest rate of " + rate + ", the third balance is expected to be "+ ((bal3 * rate) + bal3) ); 
        test.withdraw(bal3);
    }
}
