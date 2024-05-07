
/**
 * The number of even and odds are output.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/9/21
 */
import java.util.Scanner;
public class EvenAndOdd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int even = 0;
        int odd = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Input number.");
            num[i] = scan.nextInt();
            int temp = num[i]%2;
            if(temp == 0){
                even = even + 1;
            }
            if(temp == 1){
                odd = odd + 1;
            }
        }
        System.out.println("Number of evens: " + even);
        System.out.println("Number of odds: " + odd);
    }
}
