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
        City kw = new City("Wall3.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);
        
        //program solutions coded under here
        //loop program until wall is found
        while (true)
           //check if front is clear
        if (karel.frontIsClear()){
           //end program if the front is clear(wall is found)
           break;
           
           //if the front isnt clear,go down street and check for wall again
       }else {
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();  
        }
    }
    
}
