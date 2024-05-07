
/**
 * Tests BankAccount to make sure that there are no mistakes. 
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
import java.util.Scanner;
public class BankAccountTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Deposit Amount: ");
        double dep = scan.nextDouble();
        System.out.println("Enter Withdraw Amount: ");
        double wit = scan.nextDouble();
        BankAccount name = new BankAccount();
        name.deposit(dep);
        name.withdraw(wit);
        System.out.println(name.getBalance());
        System.out.println("Expected: " + (dep - wit));
    }
}
