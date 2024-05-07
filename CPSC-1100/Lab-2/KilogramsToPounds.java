/**
 *****************************
 *@Date: 9/7/2021
 *@Author: Noah Winn
 *@ID: QWX746
 *@Assignment: Lab 2
 *@Version: 1
 *@Purpose: Converts kilograms to pounds 10/50/100
 *****************************
 */
public class KilogramsToPounds{
    public static void main(String[] args){
        double[] Kilos = {10, 50, 100};
        double[] Pounds = {0,0,0};
        int index = 0;
        // converts kg to lbs
        for (double val: Kilos){
            Pounds[index] = val * 2.205;
            index++;
        }
        System.out.println("10 kg = " + Pounds[0] + " lbs");
        System.out.println("50 kg = " + Pounds[1] + " lbs");
        System.out.println("100 kg = " + Pounds[2] + " lbs");
    }
}