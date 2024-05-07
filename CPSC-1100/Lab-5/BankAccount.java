
/**
 * Write a description of class BankAccount here.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/25/21
 */
public class BankAccount{
    private double initialBalance;
    public BankAccount(){
    }
    public BankAccount(double initialBalance1){
        initialBalance = initialBalance1;
    }
    public double getBalance(){
        return initialBalance;
    }
    public void setBalance(double initialBalance1){
        initialBalance = initialBalance1;
    }
}
