
/**
 * Testing, using static methods, calculates the weight of the user for other planets
 * given the weight on Earth.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 10/14/2021
 */
import java.util.Scanner;
public class CrossPlantetaryWeightTester{
    public static void main(String[] args){
            int earthWeight = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter weight: ");
            earthWeight = scan.nextInt();
            CrossPlantetaryWeight planet = new CrossPlantetaryWeight();
            System.out.println("Weight on Moon: " + planet.Moon(earthWeight) + " lbs.");
            System.out.println("Weight on Mercury: " + planet.Mercury(earthWeight) + " lbs.");
            System.out.println("Weight on Venus: " + planet.Venus(earthWeight) + " lbs.");
            System.out.println("Weight on Jupiter: " + planet.Jupiter(earthWeight) + " lbs.");
            System.out.println("Weight on Saturn: " + planet.Saturn(earthWeight) + " lbs.");
    }
}

