
/**
 * Write a description of class BankAccount here.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/25/21
 */
public class Employee{
    private String employeeName;
    private double currentSalary;
    public Employee(){
    }
    public Employee(String employeeName1, double currentSalary1){
        employeeName = employeeName1;
        currentSalary = currentSalary1;
    }
    public String getName(){
        return employeeName;
    }
    public double getSalary(){
        return currentSalary;
    }
    public void raiseSalary(double byPercent){
        currentSalary = currentSalary + (currentSalary * (byPercent/100));
    }
}
