
/**
 * Outputs 1 million tests of both 4 roll and 24 roll.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/9/21
 */
public class DiceTester{
    public static void main(String[] args){
        int winsA = 0;
        int winsB = 0;
        int lossesA = 0;
        int lossesB = 0;
        Dice di = new Dice();
        for(int i = 0; i < 1000001; i++){
            int test = di.calculateRollFour();
            if(test >= 1){
                winsA = winsA + test;
                lossesA = lossesA + (4 - test);
            }
            else{
                lossesA = lossesA + 4;
            }
        }
        System.out.println("The results of rolling a die 4 times are:");
        System.out.println("Wins: " + (winsA / 4));
        System.out.println("Losses: " + (lossesA / 4));
        if(winsA > lossesA){
            System.out.println("Amount Won: "+ (winsA - lossesA) / 4);
        }
        if(winsA == lossesA){
            System.out.println("No money was won or lost.");
        }
        if(winsA < lossesA){
            System.out.println("Amount Lost: " + (lossesA - winsA) / 4);
        }
        for(int i = 0; i < 1000001; i++){
            int test = di.calculateRollTwentyFour();
            if(test >= 1){
                winsB = winsB + test;
                lossesB = lossesB + (24 - test);
            }
            else{
                lossesB = lossesB + 24;
            }
        }
        System.out.println("The results of rolling a die 24 times are:");
        System.out.println("Wins: " + (winsB / 24));
        System.out.println("Losses: " + (lossesB / 24));
        if(winsB > lossesB){
            System.out.println("Amount Won: "+ (winsB - lossesB) / 24);
        }
        if(winsB == lossesB){
            System.out.println("No money was won or lost.");
        }
        if(winsB < lossesB){
            System.out.println("Amount Lost: " + (lossesB - winsB) / 24);
        }
    }
}
