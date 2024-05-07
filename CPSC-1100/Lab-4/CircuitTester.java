
/**
 * Tests all possibilities of whether light is on or off.
 *
 * @author Noah Winn
 * @ID QWX746
 * @version 9/18/2021
 */
public class CircuitTester{
    public static void main(String[] args){
        
        System.out.println("1 means on, 0 means off.\n");
        
        Circuit circ = new Circuit();
        // 0 , 0 this should be off
        
        System.out.println("State of Switch 1: " + circ.getFirstSwitchState());
        System.out.println("State of Switch 2: " + circ.getSecondSwitchState());
        System.out.println("The light is " + circ.getLampState() + ".");
        System.out.println("Expected result is 0.\n");
        
        circ.toggleFirstSwitch(1);
        // 1 , 0 this should be on
        
        System.out.println("State of Switch 1: " + circ.getFirstSwitchState());
        System.out.println("State of Switch 2: " + circ.getSecondSwitchState());
        System.out.println("The light is " + circ.getLampState() + ".");
        System.out.println("Expected result is 1.\n");
        
        circ.toggleFirstSwitch(0);
        circ.toggleSecondSwitch(1);
        // 0 , 1 this should be on
        
        System.out.println("State of Switch 1: " + circ.getFirstSwitchState());
        System.out.println("State of Switch 2: " + circ.getSecondSwitchState());
        System.out.println("The light is " + circ.getLampState() + ".");
        System.out.println("Expected result is 1.\n");
        
        circ.toggleFirstSwitch(1);
        circ.toggleSecondSwitch(1);
        // 1 , 1 this should be on
        
        System.out.println("State of Switch 1: " + circ.getFirstSwitchState());
        System.out.println("State of Switch 2: " + circ.getSecondSwitchState());
        System.out.println("The light is " + circ.getLampState() + ".");
        System.out.println("Expected result is 1.\n");
    }
}
