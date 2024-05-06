import java.util.Random;
/**
 * 
 * Author: Noah Winn
 * ID: QWX746
 * Version: 4/13/2022
 * 
 */
/**
   A tester class for the recursive maximum.
*/
public class DataSetDemo{
    public static void main(String[] args){
      int[] values = { 1, 10, 100, -1, -10, -100, 100, 0};
      DataSet d = new DataSet(values, 0, values.length - 1);
      System.out.println("Maximum: " + d.getMaximum());
      System.out.println("Expected: 100");
   }
   }