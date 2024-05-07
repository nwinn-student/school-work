/**
 * Receives two inputs and calculates the sum, difference,
 * quotient, products and average of the two given numbers
 * 
 * Noah Winn
 * QWX746
 * Lab1
 * 8/26/2021
 */
import java.util.Scanner;
public class ArithmicOperators{
    public static void main(String[] args){
        //established inputs
        double firstNum = 0.0;
        double secondNum = 0.0;
        //localized operators
        double sum;
        double difference;
        double quotient = 0.0;
        double product;
        double average;
        
        Scanner scan = new Scanner(System.in);
        //direct input
        System.out.println("Input a number.");
        firstNum = scan.nextDouble();
        System.out.println("Input a number.");
        secondNum = scan.nextDouble();
        //processing
        sum = firstNum + secondNum;
        difference = firstNum - secondNum;
        if(secondNum == 0){
            System.out.println("Dividing by 0 causes an error."); 
        }
        else{
           quotient = firstNum/secondNum;
        }
        product = firstNum*secondNum;
        average = (firstNum + secondNum)/2.0; 
        //output
        System.out.println("The sum is "+sum+".");
        System.out.println("The difference is "+difference+".");
        System.out.println("The quotient is "+quotient+".");
        System.out.println("The product is "+product+".");
        System.out.println("The average is "+average+".");
    }
}