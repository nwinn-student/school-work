
/**
 * User inputs 5 values(radius), which will then be printed out
 * alongside the area that correlates with said radius.  This program
 * also outputs the  amount of elements in the array (5).
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 1/11/2022
 */
import java.util.Scanner;
public class CircleTester{
    public static void main(String[] args){
        double radius;
        Scanner scan = new Scanner(System.in);
        Circle[] circ = new Circle[5];
        //determines the radius for each circle object
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a radius: ");
            radius = scan.nextDouble();
            circ[i] = new Circle(radius);
        }
        
        System.out.println("\nRadius    Area");
        
        //prints radius and area for each circle using a for each loop
        for(Circle v: circ){
            System.out.printf("%2.2f\t%5.2f\n" , v.getRadius() , v.getArea());
        }
        
        //prints number of elements
        System.out.println("\nThere are " + circ.length + " elements in the array.");
    }
}
