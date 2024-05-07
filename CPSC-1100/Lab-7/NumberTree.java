
/**
 * Creates a number tree from 1 to 9.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/21/21
 */
public class NumberTree{
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
