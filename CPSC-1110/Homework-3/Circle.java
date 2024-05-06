
/**
 * Extends the GeometricObject class and includes the radius of
 * a circle as well as the area, diameter, and perimeter of 
 * the circle.  The toString method from the GeometricObject class 
 * has been overridden, as well as the equals method.
 *
 * @author Noah winn
 * @ID qwx746
 * @version 2/20/2021
 */
public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(){
        
    }
    public Circle(double radius1){
        radius = radius1;
    }
    public Circle(double radius1, String color, boolean filled){
        super(color, filled);
        radius = radius1;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius1){
        radius = radius1;
    }
    
    public double getArea(){
        return (3.14 * radius * radius);
    }
    public double getPerimeter(){
        return (3.14 * 2 * radius);
    }
    public double getDiameter(){
        return (2 * radius);
    }
    
    @Override
    public String toString(){
        return "Circle\n\tColor: " + getColor() + " Filled: " + isFilled() + " Date: " + getDateCreated() + "\n\tRadius: " + radius + " Area: " + getArea() + " Perimeter: " + getPerimeter() + " Diameter: " + getDiameter();
    }
    
    @Override
    public boolean equals(Object object){
        if(object instanceof Circle){
            Circle other = (Circle) object;
            return this.getColor() == other.getColor() && this.isFilled() == other.isFilled() && this.radius == other.radius;
        }
        return false;
    }
}
