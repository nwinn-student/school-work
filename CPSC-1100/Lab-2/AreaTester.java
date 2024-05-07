/**
 *****************************
 *@Date: 9/7/2021
 *@Author: Noah Winn
 *@ID: QWX746
 *@Assignment: Lab 2
 *@Version: 1
 *@Purpose: calculates area of height and width (input)
 *****************************
 */
import java.util.Scanner;
public class AreaTester{
    public static void main(String[] args){
        double length;
        double width;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the length of a rectangle.");
        length = scan.nextDouble();
        System.out.println("Enter the width of a rectangle.");
        width = scan.nextDouble();
        
        Rectangle box = new Rectangle(length, width);
        box.CalculateArea();
        System.out.println("Length is " +box.getLength());
        System.out.println("Width is " +box.getWidth());
        System.out.println("Area is " +box.getArea());
    }
}
