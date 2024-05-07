
/**
 * The largest and smallest value are output.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/9/21
 */
import java.util.Scanner;
public class SmallAndLarge{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int max = -999999;
        int min = 999999;
        for(int i = 0; i < 10; i++){
            System.out.println("Input number.");
            num[i] = scan.nextInt();
            if(max < num[i]){
                max = num[i];
                
            }
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
