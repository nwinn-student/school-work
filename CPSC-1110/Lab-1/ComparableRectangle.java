
/**
 * Extends the Rectangle class and implements the Comparable interface.
 * Overrides the compareTo and toString methods.
 *
 * @author Noah winn
 * @ID qwx746
 * @version 2/28/2021
 */
public class ComparableRectangle extends Rectangle implements Comparable< ComparableRectangle>{

    public ComparableRectangle(){
        
    }
    public ComparableRectangle(double width, double height){
        super(width,height);
    }
    @Override
    public int compareTo(ComparableRectangle o){ 
        if (getArea() > o.getArea()) { 
            return 1; 
        } else if (getArea() < o.getArea()){ 
            return - 1; 
        } else{ 
            return 0; 
        } 
    } 
    
    @Override
    public String toString() 
    { 
        return super.toString() + "Area: " + getArea(); 
    } 
}
