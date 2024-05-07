
/**
 * Outputs diamond with inputted length.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/9/21
 */
import java.util.Scanner;
public class Diamond{
    public static void main(String[] args){
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of diamond: ");
        length = scan.nextInt();
        int dist = length - 1;
        //top part
        for(int i = 0; i < length; i++){
            for(int j1 = 0; j1 < dist; j1++){
                System.out.print(" ");
            }
            for(int j2 = 0; j2 <= i; j2++){
                System.out.print("* ");
            }
            dist--;
            System.out.println();
        }
        dist = 1;
        //bottom part
        for(int i = (length - 1); i > 0; i--){
            for(int j1 = 0; j1 < dist; j1++){
                System.out.print(" ");
            }
            for(int j2 = 0; j2 < i; j2++){
                System.out.print("* ");
            }
            dist++;
            System.out.println();
        }
    }
}
