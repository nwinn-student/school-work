
/**
 * Can print the array and the array in reverse.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/16/2021
 */
public class PrintIt{
    private int[] num;
    public PrintIt(){
        
    }
    public PrintIt(int[] num1){
        num = num1;
    }

    public void order(){
        for(int v: num){
            System.out.println(v);
        }
    }
    public void reverse(){
        int[] dupe = new int[10];
        for(int i = 0; i < 10; i++){
            dupe[i] = num[(9 - i)];
        }
        for(int v: dupe){
                System.out.println(v);
        }
    }
}
