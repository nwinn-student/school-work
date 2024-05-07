
/**
 * Using charAt to add a space between characters.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/19/21
 */
import java.util.Scanner;
public class WordSeparatorChar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.nextLine();
        char cha = ' ';
        char space = ' ';
        for(int i = 0; i < str.length(); i++){
            cha = str.charAt(i);
            System.out.print(cha + "" + space);
        }
    }
}
