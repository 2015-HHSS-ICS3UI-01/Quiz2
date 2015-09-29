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
 * @author seanljnelson
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall2.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);

        //program solutions coded under here

        while (!karel.frontIsClear()) { // if front is not clear karel will turn left, move then reposition himself to face a wall 
            // if there is a wall the code will restart.

            karel.turnLeft(); // if there is a wall karel will turn left then move.
            karel.move();

            karel.turnLeft(); // repostion karel to face wall.
            karel.turnLeft();
            karel.turnLeft();
        }

    }
}