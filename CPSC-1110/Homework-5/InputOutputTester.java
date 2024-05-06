
/**
 * Tests the file and printwriter classes using ints and strings.
 *
 * @author Noah Winn
 * @id qwx746
 * @version 3/31/2022
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class InputOutputTester{
    public static void main(String [] args) throws FileNotFoundException{
        File inputFile = new File("numbers.txt");
        Scanner scan = new Scanner(inputFile);
        
        String odd = " is an odd number.";
        String even = " is an even number.";
        PrintWriter out = new PrintWriter("output.txt");
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            if(num % 2 == 1){
                out.println(num + odd);
            }
            if(num % 2 == 0){
                out.println(num + even);
            }
        }
        scan.close();
        out.close();
    }
}
