
/**
 * Outputs the average of even and odd numbers when there are only 25 numbers.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/16/2021
 */
import java.util.Scanner;
public class ValuesTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[25];
        for(int i = 0; i < 25; i++){
            System.out.println("Input number.");
            num[i] = scan.nextInt();
        }
        Values val = new Values(num);
        System.out.println("Average of even numbers.");
        val.calcAverageEven();
        System.out.println(val.getEvenAverage());
        System.out.println("Average of odd numbers.");
        val.calcAverageOdd();
        System.out.println(val.getOddAverage());
    }
}
