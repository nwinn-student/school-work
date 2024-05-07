
/**
 * Outputs multiplication table from 1 - 10.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/9/21
 */
public class MultiplicationTable{
    public static void main(String[] args){
        for(int index = 1; index <= 10; index ++){
            for(int value = 1; value <= 10; value++ ){
                System.out.printf("%6d", (index * value));
            }
            System.out.println("");
        }
    }
}
