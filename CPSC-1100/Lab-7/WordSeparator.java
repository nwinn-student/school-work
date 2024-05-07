
/**
 * Using substring to add a space between characters.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/19/21
 */
import java.util.Scanner;
public class WordSeparator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String space = " ";
        String[] spaces = new String[name.length()];
        for(int i = 0; i < name.length() ; i++){
            spaces[i] = name.substring(i,i+1) + space;
            System.out.print(spaces[i]);
        }
        
    }
}
