
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.util.Scanner;

/**
 *Quiz 2
 * @author micla1676
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall2.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);
      
        //integer to count walls
        int wallnumber = 0;
        
        while(true){
        if(!karel.frontIsClear()){
            //add 1 to wall number
            wallnumber = wallnumber + 1;
            //turn left
            karel.turnLeft();
            //move
            karel.move();
            //turn right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            
        }
        else{
            //print wallnumber
            System.out.println(wallnumber);
            break;
        }
        }
    }
    
}
