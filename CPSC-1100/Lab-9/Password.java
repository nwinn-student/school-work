
/**
 * Asks user 1 time to input a password to check if it is inside the array.
 * Could be optimized
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/16/2021
 */
import java.util.Scanner;
public class Password{
    public static void main(String[] args){
        String password[] = {
            "password" , "123456789" , "PaSsWoRd" , "PASSWORD" ,
            "pAsSwOrD" , "987654321" , "QWERTYUI" , "qwertyui" ,
            "drowssap" , "DROWSSAP"
        };

        String temp;
        int check = 0;
        boolean valid = false; //used to check whether valid
        boolean invalid = false; // 
        Scanner scan = new Scanner(System.in);
        int tester = 1; //change to test more/less times
        for(int t = 0; t < tester; t++){
            System.out.println("Input password.");
            temp = scan.nextLine();
            for(int i = 0; i < 10; i++){
                if(temp.length() == password[i].length()){
                    if(temp.charAt(0) == password[i].charAt(0)){
                        for(int v = 0; v <= (password[i].length() - 1); v++){
                            if(check == (password[i].length() - 1)){
                                if(temp.charAt((password[i].length() - 1)) == password[i].charAt((password[i].length() - 1))){
                                    valid = true; 
                                    /**
                                     * double checks last one
                                     * this is due to an error occuring
                                     * and the check variable being read as 
                                     * 7 when the last characters are not =
                                     */
                                    
                                }
                                check = 0; // resets check for later use
                            }
                            //System.out.println(check); //used to debug
                            if(temp.charAt(v) == password[i].charAt(v)){
                                check++; // increments check if char =
                            }
                            
                            if(v == (password[i].length() - 1) && check != (password[i].length() - 1)){
                                invalid = true; // used for troubleshooting
                                check = 0; //resets check for later use
                            }
                        }
                    }
                    else if(temp.charAt(0) != password[i].charAt(0)){
                        invalid = true; // used for troubleshooting
                    }
                }
                else{
                    invalid = true; // used for troubleshooting
                }
            }
            //checks whether valid is true, which means that the password
            //is correct in all aspects
            if(invalid == true){
                if(valid == true){
                    System.out.println("Valid password");
                }
                else{
                    System.out.println("Invalid password");
                }
            }
            valid = false; //resets for more tests if needed
        }
    }
}
