
/**
 * Swaps t and x.
 * Copied and pasted from lab 2 HelloPrinter.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/21/21
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TtoX{
    public static void main(String[] args){
        ArrayList<Character> tabb = new ArrayList<Character>();
        String phrase;
        Scanner scan = new Scanner(System.in);
        System.out.println("What phrase do you want to use for switching x and t?");
        phrase = scan.nextLine();
            //changes a given string
        for(int index = 0; index < phrase.length();index++){
            tabb.add(phrase.charAt(index));
                //checks if t or x
            if (tabb.get(index) == 't'){
                tabb.set(index, 'x');
            }
            else if (tabb.get(index) == 'T'){
                tabb.set(index, 'X');
            }
            else if (tabb.get(index) == 'x'){
                tabb.set(index, 't');
            }
            else if (tabb.get(index) == 'X'){
                tabb.set(index, 'T');
            }
            System.out.print(tabb.get(index));
        }

    }
}
