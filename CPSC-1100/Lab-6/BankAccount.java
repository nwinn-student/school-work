
/**
 * Calculates the balance using the withdraw and deposit method.
 * These methods cannot receive negative inputs or negative.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
public class BankAccount{
    private double balance;
    
    public BankAccount(){
        balance = 0;
    }
    public BankAccount(double balance1){
        balance = balance1;
    }
    
    public void deposit(double amount){  
        if(amount < 0){
            System.out.println("Invalid Input.");
        }
        else{
            balance = balance + amount;
        }
    }
    public void withdraw(double amount){
        double check = balance - amount;
        if(amount < 0){
            System.out.println("Invalid Input.");
        }
        else if(amount > 0){
            if(check < 0){
                System.out.println("Overdrawn.");
            }
            else{
                balance = balance - amount;
            }
        }
        
    }
   
    public double getBalance(){   
        return balance;
    }
}
