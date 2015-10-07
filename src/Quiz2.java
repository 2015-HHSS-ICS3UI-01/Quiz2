/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author lamon
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);

        //program solutions coded under here
        //commands below will be executed no matter what
        while (true) {
            //if karel's front isn't clear, the commands below will be executed
            if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            //if karel's front is clear, the commands below will be executed
            if (karel.frontIsClear()) {
                //breaks the program out of the while loop
                break;
            }
        }

    }
}
