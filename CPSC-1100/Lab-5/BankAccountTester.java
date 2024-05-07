
/**
 * Write a description of class BankAccount here.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/25/21
 */
import java.util.Scanner;
public class BankAccountTester{
    public static void main(String[] args){
        double balance;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter balance: ");
        balance = scan.nextDouble();
        BankAccount bal1 = new BankAccount(balance);
        System.out.println("Enter balance: ");
        balance = scan.nextDouble();
        BankAccount bal2 = new BankAccount(balance);
        System.out.println("Enter balance: ");
        balance = scan.nextDouble();
        BankAccount bal3 = new BankAccount(balance);
        
        System.out.println("Balance 1: " + bal1.getBalance());
        System.out.println("Balance 2: " + bal2.getBalance());
        System.out.println("Balance 3: " + bal3.getBalance());
    }
}
