
/**
 * Calculates the average using a sentinel loop.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/21/21
 */
import java.util.Scanner;
public class Sentinel{
    public static void main(String[] args){
        final int SENT = -1;
        int count = 0;
        int sumEven = 0;
        int sumOdd = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number -1 to end: ");
        int num = scan.nextInt();
        int holder = 0;
        double averageEven = 0;
        double averageOdd = 0;
        int timesE = 1;
        int timesO = 1;
        while(num != SENT){
            if(num == -1){
            }
            else{
                holder = num % 2;
                if(holder == 1){
                    sumOdd = sumOdd + num;
                    timesO++;
                }
                if(holder == 0){
                    sumEven = sumEven + num;
                    timesE++;
                }
            }
            System.out.println("Enter a number -1 to end: ");
            num = scan.nextInt();
        }
        if(timesE > 1){
            averageEven = (double)(sumEven / (timesE - 1));
            System.out.println("The average of even numbers: " + averageEven);
        }
        if(timesO > 1){
            averageOdd = (double)(sumOdd / (timesO - 1));
            System.out.println("The average of odd numbers: " + averageOdd);
        }
    }
}
