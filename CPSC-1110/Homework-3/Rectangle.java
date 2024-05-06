
/**
 * Extends the GeometricObject class and includes the width and height
 * of a rectangle as well as the perimeter and area of said rectangle.
 * 
 *
 * @author Noah winn
 * @ID qwx746
 * @version 2/20/2021
 */
public class Rectangle extends GeometricObject{
    
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double width1, double height1){
        width = width1;
        height = height1;
    }
    public Rectangle(double width1, double height1, String color, boolean filled){
        super(color, filled);
        width = width1;
        height = height1;
    }
    
    public double getWidth(){
        return width;
    }
    public void setWidth(double width1){
        width = width1;
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height1){
        height = height1;
    }
    
    public double getArea(){
        return (width * height);
    }
    public double getPerimeter(){
        return ( (2 * width) + (2 * height) );
    }
}
