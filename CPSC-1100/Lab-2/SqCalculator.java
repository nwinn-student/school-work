/**
 *****************************
 *@Date: 9/7/2021
 *@Author: Noah Winn
 *@ID: QWX746
 *@Assignment: Lab 2
 *@Version: 1
 *@Purpose: Prints the square of 1 through 9
 *****************************
 */
public class SqCalculator{
    public static void main(String[] args){
        double num;
        for (double i = 1; i < 10; i++){
            num = Math.pow(i,2);
            System.out.println(num + " is "+ i + " squared.");
        }
    }
}
