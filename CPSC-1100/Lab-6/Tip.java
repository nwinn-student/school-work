
/**
 * Calculates the tip based on the satisfaction amount.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
public class Tip{
    private int satisfactionRating;
    //constructor
    public Tip(){
    }
    //overloaded constructor
    public Tip(int satRating){
        satisfactionRating = satRating;
    }
    //calculates the tip using the inputted bill
    public double CalcTip(double bill){
        double tip = 0;
        
        if(satisfactionRating <= 1){
            tip = bill * 0.20;
        }
        if(satisfactionRating > 1 && satisfactionRating < 3){
            tip = bill * 0.15;
        }
        if(satisfactionRating >= 3){
            tip = bill * 0.10;
        }
        return tip;
    }
}
