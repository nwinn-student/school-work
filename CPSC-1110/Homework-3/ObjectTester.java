
/**
 * Tests the GeometricObject, Rectangle object contructors, and Circle object
 * constructors.  These are tested using the toString method, as well as the 
 * equals method to compare the two Circle objects and a Circle object with 
 * a Rectangle object.
 *
 * @author Noah winn
 * @ID qwx746
 * @version 2/20/2021
 */
public class ObjectTester{
    public static void main(String args[]){
        GeometricObject obj = new GeometricObject("Red", false);
        //toString method called for GeometricObject
        System.out.println(obj.toString());
        
        //toString method called for both Rectangle objects
        
        Rectangle rect2 = new Rectangle(1, 1);
        System.out.println(rect2.toString());
        
        Rectangle rect4 = new Rectangle(2, 2, obj.getColor(), true);
        System.out.println(rect4.toString());
        
        //toString method called for both Circle objects
        
        Circle circ1 = new Circle(3);
        System.out.println(circ1.toString());
        
        Circle circ3 = new Circle(3, obj.getColor(), obj.isFilled());
        System.out.println(circ3.toString());
        
        //Compares whether circ3 (4 param) is equivalent to circ1 (2 param)
        
        System.out.println(circ1.equals(circ3)); //prints false
        
        /**
         * To solve the problem of an error occuring when comparing the Circle
         * object to the Rectangle object, use an if statement that filters 
         * out any unwanted objects (prints false instead of becoming an error)
         */
        
        System.out.println(circ1.equals(rect2)); //prints false
    }
}
