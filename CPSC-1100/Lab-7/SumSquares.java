
/**
 * Calculates the sum of all squared numbers from 1 to 100.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/19/21
 */
public class SumSquares{
    public static void main(String[] args){
        int square = 0;
        for(int i = 0; i <= 100; i++){
            square = (i*i) + square;
        }
        System.out.println("Sum of all squares to 100: " + square);
    }
}
