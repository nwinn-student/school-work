
/**
 * Using static methods, calculates the weight of the user for other planets
 * given the weight on Earth.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
import java.util.Scanner;
public class CrossPlantetaryWeight{
    static double Moon(double earthWeight){
        earthWeight = earthWeight * 0.1666;
        return earthWeight;
    }
    static double Mercury(double earthWeight){
        earthWeight = earthWeight * 0.4;
        return earthWeight;
    }
    static double Venus(double earthWeight){
        earthWeight = earthWeight * 0.9;
        return earthWeight;
    }
    static double Jupiter(double earthWeight){
        earthWeight = earthWeight * 2.5;
        return earthWeight;
    }
    static double Saturn(double earthWeight){
        earthWeight = earthWeight * 1.1;
        return earthWeight;
    }
    
}
