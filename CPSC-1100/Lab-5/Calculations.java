
/**
 * Capable of calculating sums, differences, products, and quotients.
 *
 * @author Noah Winn
 * @ID: QWX746
 * @version 9/25/21
 */
public class Calculations{
    private double num1;
    private double num2;
    private double sum;
    private double difference;
    private double product;
    private double quotient;
    public Calculations(){
    }
    public Calculations(double num1a, double num2a){
        num1 = num1a;
        num2 = num2a;
    }
    public double getSum(){
        return sum;
    }
    public double getDifference(){
        return difference;
    }
    public double getProduct(){
        return product;
    }
    public double getQuotient(){
        return quotient;
    }
    public void CalculateSum(){
        sum = num1 + num2;
    }
    public void CalculateDifference(){
        difference = num1 - num2;
    }
    public void CalculateProduct(){
        product = num1 * num2;
    }
    public void CalculateQuotient(){
        quotient = num1 / num2;
    }
}
