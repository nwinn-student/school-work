
/**
 * Uses do while loop and calculates the sum of 10 - 20.
 *
 * @author Noah Winn
 * @ID qwx756
 * @version 10/15/2021
 */
public class Do10to20{
    public static void main(String[] args){
        int num = 10;
        int sum = 0;
        int numHolder;
        do{
            numHolder = num;
            sum = sum + numHolder;
            num++;
        }while(num <= 20);
            
        System.out.println("The sum is: " + sum);
    }
}
