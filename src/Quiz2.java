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
 * @author MiodragM
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
        
        //keeps going while statement is true
       while (true){
        // when front is not clear karel checks until front is clear and repeats
        while (!karel.frontIsClear()){
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }   
        // stop when there is no wall
            break;
        }
    }
       }
       
    
    
