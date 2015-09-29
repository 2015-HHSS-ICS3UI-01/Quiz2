/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/**
 *
 * @author Whitb0039
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall2.txt");
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.WEST);

        //program solutions coded under here

        //turn left and move one the check for a wall on the right
        while (true) {
            karel.turnLeft();
            karel.move();
            karel.turnRight();
            //if there is a wall go to the next street and check for a wall
            while (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.move();
                karel.turnRight();
            }
            //once there is no wall the program will stop
            break;
        }



    }
}
