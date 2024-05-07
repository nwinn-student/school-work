
/**
 * Simulates a ball being shared.
 *
 * @author Noah Winn
 * @id qwx746
 * @course# 2800
 * @version 3/05/2023
 */
import java.lang.Math;
import java.util.concurrent.*;
public class TeamMechanics implements Runnable{
    //Stored values
    private Semaphore sim;
    private String teamName;
    
    public TeamMechanics(Semaphore sim, String teamName){
        //Input values
        this.sim = sim;
        this.teamName = teamName;
    }
    @Override
    public void run(){
        //Allows the team to be in posession of the ball 10 times,
        //switching with other teams as needed.
        for(int turns = 1; turns < 10; turns++){
            int random = (int)(Math.random() * 2500);
            try{
                //Team desires the ball
                System.out.println(teamName + " team wants the ball. Turn#" + turns);
                sim.acquire();
                //Team is in posession of the ball
                System.out.println(teamName + " team is playing with the ball. Turn#" + turns);
                Thread.sleep(random);
            }
            
            catch(InterruptedException e){
                System.out.println(e);
            }
            //Team has finished playing with the ball
            System.out.println(teamName + " is done playing with the ball. Turn#"+turns);
            sim.release();
            try{
                //Team is resting, allowing other teams to play.
                Thread.sleep(random);
            }
            catch(InterruptedException e){}
        }
    }
}
