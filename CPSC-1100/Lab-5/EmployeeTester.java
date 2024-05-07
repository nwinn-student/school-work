
/**
 * Write a description of class BankAccount here.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/25/21
 */
import java.util.Scanner;
public class EmployeeTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter employee name: ");
        String empName = scan.nextLine();
        System.out.println("Enter salary: ");
        double salary = scan.nextDouble();
        System.out.println("Enter percentage to raise salary by: ");
        double percentage = scan.nextDouble();
        Employee emp = new Employee(empName, salary);
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        emp.raiseSalary(percentage);
        System.out.println("New Salary: " + emp.getSalary());
    }
}
