/**
 *****************************
 *@Date: 9/7/2021
 *@Author: Noah Winn
 *@ID: QWX746
 *@Assignment: Lab 2
 *@Version: 1
 *@Purpose: Swaps e and o of a fixed and user inputted string.
 *****************************
 */
import java.util.ArrayList;
import java.util.Scanner;
public class HelloPrinter{
    public static void main(String[] args){
        
        // swaps e and o (a fixed string)
        String hello = "Hello World";
    
        hello = hello.replace("o","e");
        hello = hello.replaceFirst("e", "o");
        
        System.out.println(hello);
    
        //another way
        String hello1 = "Hello World";
        hello1 = hello1.replace("e","x");
        hello1 = hello1.replace("o","e");
        hello1 = hello1.replace("x","o");
        System.out.println(hello1);
        
        /*
         * The part below this comment allows the user to type whichever
         * string they want and it will both display the string and swap o and e.
         * 
         * This was made because I (the author) thought that simply replacing
         * e for o the way I chose to above was not going to work for 
         * all other strings, so I created a way that would work.
         * 
         */
        
            //tabb holds all values from phrase
        ArrayList<Character> tabb = new ArrayList<Character>();
        String phrase;
        Scanner scan = new Scanner(System.in);
        System.out.println("What phrase do you want to use for switching e and o?");
        phrase = scan.nextLine();
            //changes a given string
        for(int index = 0; index < phrase.length();index++){
            tabb.add(phrase.charAt(index));
                //checks if e or o
            if (tabb.get(index) == 'e'){
                tabb.set(index, 'o');
            }
            else if (tabb.get(index) == 'E'){
                tabb.set(index, 'O');
            }
            else if (tabb.get(index) == 'o'){
                tabb.set(index, 'e');
            }
            else if (tabb.get(index) == 'O'){
                tabb.set(index, 'E');
            }
            System.out.print(tabb.get(index));
        }
    }
}