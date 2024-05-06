
/**
 * Tests the usages of the File, FileNotFoundException, and PrintWriter
 * objects when applying them using the input and output files. 
 *
 * @author Noah Winn
 * @id qwx746
 * @version 3/13/2022
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class TestingFiles{
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile = new File("input.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[^A-Za-z]+");
        while(in.hasNext()){
            String text = in.next();
            //prints each word, as separated by a space
            System.out.println(text);
        }
        
        PrintWriter out = new PrintWriter("output.txt");
        out.println("This is going to be written inside the text file");
        
        in.close();
        out.close();
    }
}
