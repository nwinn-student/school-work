
/**
 * Sum of all even numbers between 2 and 100(inclusive).
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/19/21
 */
public class SumEven{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i <= 100; i = i + 2){
            sum = sum + i;
        }
        System.out.println("Sum of all even numbers to 100: " + sum);
    }
}
