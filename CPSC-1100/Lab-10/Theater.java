
/**
 * Can check whether the theater is full or not
 * will automatically stop running.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/17/2021
 */
import java.util.Scanner;
public class Theater{
    private boolean maxCapacity = false;
    
    public boolean getCapacity(){
        return maxCapacity;
    }
    
    public void printSeats(int[][] seats){
        int counter = 0;
        System.out.println("Seat: " + seats[0].length);
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[i].length; j++){
                System.out.printf("%3d", seats[i][j]);
                 if(seats[i][j] == 0){
                    counter++; //max is 9
                    if(counter == 90){
                        System.out.println("\nTheater is full.");
                        maxCapacity = true;
                    }
                }
            }
            System.out.println();
        }
    }

    public void sellSeatByPrice(int[][] seats, int price){
        for (int i = 0; i < seats.length; i++){
            for (int j = 0; j < seats[i].length; j++){
                if (seats[i][j] == price){
                    seats[i][j] = 0;
                    return;
                }
            }
        }
        System.out.println("Sorry, no seat found with that price.");
    }
  
    public void sellSeatByNumber(int[][] seats){
        System.out.println("Enter the row and seat number you want: ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        if (row > 0 && row <= seats.length){
           int seat = scan.nextInt();
           if (seat > 0 && seat <= seats[seats.length - row].length){
              if (seats[seats.length - row][seat - 1] != 0){
                 seats[seats.length - row][seat - 1] = 0;
              }
              else{
                 System.out.println("Sorry, seat already occupied.");
              }
           }
           else{
              System.out.println("Sorry, invalid row.");
           }
        }
        else{
           System.out.println("Sorry, invalid row.");
        }
    }
}
