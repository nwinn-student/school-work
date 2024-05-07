
/**
 * Calculates the position of a virtual address in a given page size.
 *
 * @author Noah Winn
 * @id qwx746
 * @course# 2800
 * @version 2/27/2023
 */
import java.util.Scanner;
import java.lang.Math;
public class Pages{
    public static void main(String[] args){
        //Input variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter page:");
        long pageSize = scan.nextLong();
        long virtualAddress;
        
        //Error Strings
        String errorPS = "User inputted an invalid page size.";
        String errorVA = "User inputted an invalid virtual address.";
        
        //Variables used to ensure that the program does not output whenever
        //the requirements are not met.
        Boolean page = false;
        int count = 0;
        
        //Output variables
        double addressInPage = 0;
        double offset = 0;
        
        //Ensures the page size is within the required range.
        if(pageSize <= 16384 && pageSize >= 512){
            
            //Checks if the pageSize follows the rule that the page size
            //is 2 to the power of a number in between 9 and 14.
            for(int i = 0; i <= 5; i++){
                if(pageSize % Math.pow(2,(i+5)) == 0){
                    count += 1;
                }
            }
            if(count == 0){
                //The page did not fit the requirements.
                System.out.println(errorPS);
            }
            else{
                //The page fits the requirements.
                page = true;
            }
        } 
        else{
            //The page was not within the set parameters.
            System.out.println(errorPS);
        }
        if(page == true){
            System.out.println("Enter virtual address:");
            virtualAddress = scan.nextLong();
            
            //Calculates the page and position of the address in the page.
            if(virtualAddress >= 0 && virtualAddress <= 4294967295L){
                addressInPage = Math.floor(virtualAddress/pageSize);
                offset = virtualAddress % pageSize;
                
                //Prints the output.
                System.out.println("This address is in virtual page:\n" + addressInPage);
                System.out.println("At offset:\n" + offset);
            }
            else{
                //The page was not within the set parameters.
                System.out.println(errorVA);
            }
        }
    }    
}
