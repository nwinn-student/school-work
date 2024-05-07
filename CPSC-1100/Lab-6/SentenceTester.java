

/**
 * Compares the strings using for loops, applicable in a sentence and word sense.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
import java.util.Scanner;
public class SentenceTester{
    public static void main(String[] args){
        //use a for loop to iterate through the string and comparing using length - 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string1 = scan.next();
        System.out.println("Enter a string: ");
        String string2 = scan.next();
        char currentChar1 = ' ';
        char currentChar2 = ' ';
        boolean checker = false;
        for(int i = 0; i < string1.length(); i++){
            currentChar1 = string1.charAt(i);
            currentChar2 = string2.charAt(i);
            if(currentChar1 != currentChar2){
                checker = false;
            }
        }
        if(checker == false){
            System.out.println("These strings are not exactly the same.");
        }
        else{
            System.out.println("These strings are the same.");
        }
    }
}
