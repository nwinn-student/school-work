/**
 * Tests the ComparableRectangle class.
 *
 * @author Noah winn
 * @ID qwx746
 * @version 2/28/2021
 */
import java.util.Arrays;
public class SortRectangles{ 
    public static void main(String[] args){ 
        ComparableRectangle[] rectangles = 
        {
            new ComparableRectangle(3.5, 5.5), 
            new ComparableRectangle(12.24, 55.5), 
            new ComparableRectangle(7.5, 35.5), 
            new ComparableRectangle(1.5, 25.5)
        }; 
        
        Arrays.sort(rectangles); 
        for (ComparableRectangle rectangle : rectangles){ 
            System.out.print(rectangle + "     "); 
            System.out.println(); 
        } 
    } 
} 