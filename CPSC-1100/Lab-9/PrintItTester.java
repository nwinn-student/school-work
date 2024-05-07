
/**
 * Tests PrintIt, prints the array and the reverse of the array.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/16/2021
 */
import java.util.Scanner;
public class PrintItTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Input number.");
            num[i] = scan.nextInt();
        }
        PrintIt print = new PrintIt(num);
        System.out.println("Order:");
        print.order();
        System.out.println("Reverse:");
        print.reverse();
    }
}
