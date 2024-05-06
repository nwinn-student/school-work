
/**
 * Extends the ArithmeticException class and is used when an exception occurs.
 *
 * @author Noah Winn
 * @id qwx746
 * @version 3/31/2022
 */

public class NanException extends ArithmeticException{
    
    public NanException(){
    }
    public NanException(String message){
        super(message);
    }
}
