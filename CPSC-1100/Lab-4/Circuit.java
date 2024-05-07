
/**
 *  Can be called to check whether light is on or off.
 *
 * @author Noah Winn
 * @ID QWX746
 * @version 9/18/2021
 */
public class Circuit{
    private int switch1;
    private int switch2;
    private int Light;
    
    public Circuit(){
    }
    public Circuit(int switch1A, int switch2A){
        switch1 = switch1A;
        switch2 = switch2A;
    }
    public int getFirstSwitchState(){
        return switch1;
    }
    public int getSecondSwitchState(){
        return switch2;
    }
    public int getLampState(){
        Light = Math.min(switch2 + switch1, 1);
        return Light;
    }
    public void toggleFirstSwitch(int switch1A){
        switch1 = switch1A;
    }
    public void toggleSecondSwitch(int switch2A){
        switch2 = switch2A;
    }
}