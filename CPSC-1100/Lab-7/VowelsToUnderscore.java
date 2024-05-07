
/**
 * Swaps all vowels with underscore.
 * Copied and pasted from lab 2 HelloPrinter.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/21/21
 */
import java.util.ArrayList;
import java.util.Scanner;
public class VowelsToUnderscore{
    public static void main(String[] args){
        ArrayList<Character> tabb = new ArrayList<Character>();
        String phrase;
        Scanner scan = new Scanner(System.in);
        System.out.println("What phrase do you want to use for switching vowels and underscore?");
        phrase = scan.nextLine();
            //changes a given string
        for(int index = 0; index < phrase.length();index++){
            tabb.add(phrase.charAt(index));
                //checks if t or x
            if (tabb.get(index) == 'a'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'A'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'e'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'E'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'i'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'I'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'o'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'O'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'u'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'U'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'y'){
                tabb.set(index, '_');
            }
            else if (tabb.get(index) == 'Y'){
                tabb.set(index, '_');
            }
            System.out.print(tabb.get(index));
        }

    }
}
