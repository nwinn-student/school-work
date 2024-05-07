
/**
 * Can calculate the average of both even and odd numbers in an array.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/16/2021
 */
public class Values{
    private int[] num;
    private double avEven;
    private double avOdd;
    public Values(){
        
    }
    public Values(int[] num1){
        num = num1;
        avEven = 0;
        avOdd = 0;
    }
    public void calcAverageEven(){
        //if num is even then average
        //calculate total num of even
        double amountEven = 0; //add 1 when there is an even
        double totalEven = 0;
        for(int i = 0; i < num.length; i++){
            if((num[i] % 2) == 0){
                amountEven++;
                totalEven = totalEven + num[i];
            }
        }
        avEven = (totalEven / amountEven);
    }
    public void calcAverageOdd(){
        //if num is odd then average
        //calculate total number of odd
        int amountOdd = 0; //add 1 when there is an odd
        double totalOdd = 0;
        for(int i = 0; i < num.length; i++){
            if((num[i] % 2) == 1){
                amountOdd++;
                totalOdd = totalOdd + num[i];
            }
        }
        avOdd = (totalOdd / amountOdd);
    }
    public double getEvenAverage(){
        return avEven;
    }
    public double getOddAverage(){
        return avOdd;
    }
}
