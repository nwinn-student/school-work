
/**
 * Gathers the color of the object, whether the object is filled, 
 * and the date the object was created.  The toString method has
 * been overridden to print out the color, filled, and dateCreated
 * values.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 2/20/2021
 */

public abstract class GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated = new java.util.Date();
    
    /**
     * Constructor for objects of class GeometricObject
     */
    public GeometricObject(){
        color = "white";
    }
    public GeometricObject(String color, boolean filled1){
        this.color = color;
        filled = filled1;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color1){
        color = color1;
    }
    
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled1){
        filled = filled1;
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public String toString(){
        return "GeometricObject\n\tColor: " + color + " Filled: " + filled + " Date: " + getDateCreated() + "\n\t";
    }
}
