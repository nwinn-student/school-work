
/**
 * Extends GeometricObject while implementing the Colorable and 
 * Comparable interfaces. Overrides the toString and compareTo methods.  
 * 
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 2/27/2021
 */
public class Square extends GeometricObject implements Colorable, Comparable<Square>{
    private int side;
    
    public Square(){
    
    }
    public Square(int side1){
        side = side1;
    }
    
    public int getSide(){
        return side;
    }
    public void setSide(int side1){
        side = side1;
    }
    public String howToColor(){
        return "Color all four sides.";
    }
    @Override
    public int compareTo(Square o){
        if(side != o.getSide()){
            return side - o.getSide();
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Square\n\tSide: " + side + " Area: " + (side*side) + "\n\t";
    }
    public interface Comparable <E>{ 
     public int compareTo(E o); 
    } 
}
