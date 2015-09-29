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
 * @author AngelOfTheVoid
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall3.txt");
        Robot rob = new Robot(kw, 1, 1, Direction.WEST);
        
        //program solutions coded under here
       while(true){
        if(!rob.frontIsClear()){
            rob.turnLeft();
            rob.move();
        //when rob checks if thereis  a wall it will then turn and move if there is
    if(rob.frontIsClear()){
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
    //when there is no wall infont of rob it will turn three times  
    }
    }
       }  
    }
    
}
