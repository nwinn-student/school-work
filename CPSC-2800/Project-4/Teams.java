
/**
 * Tests the TeamMechanics class with three threads.
 *
 * @author Noah Winn
 * @id qwx746
 * @course# 2800
 * @version 3/05/2023
 */
import java.util.concurrent.*;
public class Teams
{
    public static void main(String[] args){
        Semaphore sem = new Semaphore(1);
        //Teams
        TeamMechanics blue = new TeamMechanics(sem, "Blue");
        TeamMechanics white = new TeamMechanics(sem, "White");
        TeamMechanics red = new TeamMechanics(sem, "Red");
        //Threads
        Thread blueTeam = new Thread(blue);
        Thread whiteTeam = new Thread(white);
        Thread redTeam = new Thread(red);
        
        try{
            //Initiates team threads
            blueTeam.start();
            whiteTeam.start();
            redTeam.start();
            //Forces each thread to wait for the other using semaphores.
            blueTeam.join();
            whiteTeam.join();
            redTeam.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
