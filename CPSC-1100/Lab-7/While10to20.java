
/**
 * Uses while loop and calculates the sum of 10 - 20.
 *
 * @author Noah Winn
 * @ID qwx756
 * @version 10/15/2021
 */
public class While10to20{
    public static void main(String[] args){
        int num = 10;
        int sum = 0;
        int numHolder;
        while(num <= 20){
            numHolder = num;
            sum = sum + numHolder;
            num++;
        }
        System.out.println("The sum is: " + sum);
    }
}
