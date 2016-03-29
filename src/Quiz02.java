
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class Quiz02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City("Wall1.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);

        while (true){
        if(karel.frontIsClear()){
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        if (karel.frontIsClear()){
            
            break;
        }
        }
        }
}
    

        
    
   
   



