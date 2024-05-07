
/**
 * Reads every second letter of a string.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/20/21
 */
import java.util.Scanner;
public class SecondLetter{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String phrase = scan.nextLine();
        for(int i = 1; i < phrase.length(); i = i + 2){
            System.out.print(phrase.charAt(i));
        }
    }
}
