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
 * @author richj0985
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);
        
        // program solutions coded under here
        
        // make karel move down the row of walls on the west side 
        // until there are no walls left, therefore stops
        // this should work in all three cities
        
        // make karel check if his front is not clear
        while(!karel.frontIsClear()){
            // make karel first turn left to face north
            karel.turnLeft();
            // make karel then move down a street
            karel.move();
            // make karel turn left three times to face the west side with the walls
            // looping back to check again if his front is clear
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        
    }

}
