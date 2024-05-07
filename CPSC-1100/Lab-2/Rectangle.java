/**
 *****************************
 *@Date: 9/7/2021
 *@Author: Noah Winn
 *@ID: QWX746
 *@Assignment: Lab 2
 *@Version: 1
 *@Purpose: custom Rectange object that calculates area or perimeter
 *****************************
 */
public class Rectangle{
    private double length = 0;
    private double width = 0;
    private double area;
    private double perimeter;
    
    public Rectangle(){
        
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
        public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void CalculateArea() {
        area = length * width;
    }
    public void CalculatePerimeter() {
        perimeter = (2*length + 2*width);
    }
    
}