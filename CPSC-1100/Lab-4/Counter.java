
/**
 * Has click, reset, undo, setLimit methods.
 *
 * @author Noah Winn
 * @ID QWX746
 * @ Lab 4
 * @version 9/18/2021
 */
public class Counter{
    private int value;
    //original
    public Counter(){
        
    }
    
    public int getValue(){
        return value;
    }
    public void click(){
        value++;
    }
    public void reset(){
        value = 0;
    }
    //E3.1
    public void undo(){
        value--;
        value = Math.max(value,0);
    }
    //E3.2
    public void setLimit(int maximum){
        value = Math.min(value, maximum);
    }
}
