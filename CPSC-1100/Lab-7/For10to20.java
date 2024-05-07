
/**
 * Uses for loop and calculates the sum of 10 - 20.
 *
 * @author Noah Winn
 * @ID qwx756
 * @version 10/15/2021
 */
public class For10to20{
    public static void main(String[] args){
        int sum = 0;
        int numHolder;
        for(int num = 10; num <= 20; num++){
            numHolder = num;
            sum = sum + numHolder;
        }
        System.out.println("The sum is: " + sum);
    }
}
