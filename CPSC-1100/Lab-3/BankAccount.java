
/**
 * Purpose: A bank account which adds interest
 *
 * @Author Noah Winn
 * @ID QWX746
 * @ Lab 3
 * @version 9/14/2021
 */
public class BankAccount{
    private double balance;
    
    public BankAccount(){
        balance = 0;
    }
    public BankAccount(double initialBalance){   
      balance = initialBalance;
    }

    public void deposit(double amount){  
      balance = balance + amount;
    }
    public void withdraw(double amount){   
      balance = balance - amount;
    }
    
    public double getBalance(){   
      return balance;   
    }
    
    public void addInterest(double rate){
        balance = (balance * rate) + balance;
    }
}