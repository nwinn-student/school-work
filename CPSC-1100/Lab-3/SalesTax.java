
/**
 * Purpose: Allows user to calculate sales tax and total cost
 *
 * @author Noah Winn
 * @ID QWX746
 * @ Lab3
 * @version 9/14/2021
 */
public class SalesTax{
    private double tax = 0;
    private double purchasePrice;
    private double taxDue;
    private double totalCost;
    public SalesTax(){
        
    }
    public SalesTax(double taxInput){
        tax = taxInput;
    }
    
    public double getTax() {
        return tax;
    }
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public double getTaxDue() {
        return taxDue;
    }
    public void calculateSalesTax(double purchase){
        purchasePrice = purchase;
        taxDue = (purchase * tax);
    }
    public void totalCost(){
        totalCost = taxDue + purchasePrice;
    }
    public double getTotalCost(){
        return totalCost;
    }
}
