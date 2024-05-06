
/**
 * Tests the GeometricObject abstract and the Square class.  Uses the 
 * Colorable interface to compare the objects.  Sorts the array.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 2/27/2021
 */
import java.util.Arrays;
public class Tester{
    public static void main(String[] args){
        GeometricObject[] obj = new GeometricObject[6];
        obj[0] = new Circle(2);
        obj[1] = new Circle(3);
        obj[2] = new Rectangle(4, 5);
        obj[3] = new Rectangle(5, 8);
        obj[4] = new Square(3);
        obj[5] = new Square(4);
        
        for(int i = 0; i < 6; i++){
            System.out.println(obj[i].toString());
            if(obj[i] instanceof Colorable){
                System.out.println(((Colorable)obj[i]).howToColor());
            }
        }
        Square[] squares = new Square[4];
        squares[0] = new Square(3);
        squares[1] = new Square(2);
        squares[2] = new Square(5);
        squares[3] = new Square(1);
        
        Arrays.sort(squares);
        System.out.println(Arrays.toString(squares));
    }
}