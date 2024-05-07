
/**
 * If theater is full then it
 * will automatically stop running.
 *
 * @author Noah Winn
 * @ID qwx746
 * @version 11/17/2021
 */
import java.util.Scanner;
public class TheaterTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //print 10 x 9 
        int[][] seats = {
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
            { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
            { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }
        };
        //prompt user to enter seat (row, seat num), or price
        //mark sold seats to price = 0
        //make sure seat is available, if not then let user redo
        //if user says price then find a random seat in that price and send (row, seat) to user
        //after each seats are sold redisplay chart
        //let program run until all seats are taken
        Theater seating = new Theater();
        seating.printSeats(seats);
  
        System.out.println("Pick by <s>eat or <p>rice or <q> to quit: ");
        String choi = scan.next();
        while (!choi.equals("q")){
            if (choi.equals("s")){
              seating.sellSeatByNumber(seats);
            }
            else{
                 // pick by price
                 System.out.println("What price do you want to buy?");
                 int price = scan.nextInt();
                seating.sellSeatByPrice(seats, price);
            }
            seating.printSeats(seats);
            if(seating.getCapacity() == true){
                break;
            }
            System.out.println("Pick by <s>eat or <p>rice or <q> to quit: ");
            choi = scan.next();
        }
    }
 }