
/**
 * Tests to make sure counter works properly.
 *
 * @author Noah Winn
 * @ID QWX746
 * @ Lab 4
 * @version 9/18/2021
 */
public class CounterTester{
    public static void main(String[] args){
        Counter tally = new Counter();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.undo();
        tally.setLimit(3);
        int result = tally.getValue();
        System.out.println("Result: " + result);
    }
}
