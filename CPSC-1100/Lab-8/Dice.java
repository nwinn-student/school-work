
/**
 * Calculates amount of times 6 was hit.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/9/21
 */
public class Dice{
    int sides = 6;
    
    public Dice(){
    }
    //getters
    public int getSides(){
        return sides;
    }
    //setters
    public void setSides(int sides1){
        sides = sides1;
    }
    
    public int calculateRollFour(){
        int times = 0;
        for(int i = 0; i < 4;i++){
            int tempside = (int) (Math.random() * sides + .1);
            if(tempside == sides){
                times++;
            }
        }
        return times;
    }
    public int calculateRollTwentyFour(){
        int times = 0;
        for(int i = 0; i < 24; i++){
            int tempside1 = (int) (Math.random() * sides + .1);
            int tempside2 = (int) (Math.random() * sides + .1);
            if(tempside1 == sides && tempside2 == sides){
                times++;
            }
        }
        return times;
    }
}
