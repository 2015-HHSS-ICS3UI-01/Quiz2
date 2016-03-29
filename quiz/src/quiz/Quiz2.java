/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author fostp4040
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
               Robot karel = new Robot(Kitchener,1,1,Direction.WEST);
               new Wall (Kitchener,1,1,Direction.WEST); 
               new Wall (Kitchener,2,1,Direction.WEST);
               while(!karel.frontIsClear())
               {
                   if(karel.frontIsClear())
                   {
                       karel.move();
                   }
                   else{
                      karel.turnLeft();
                      karel.move();
                      karel.turnLeft();
                      karel.turnLeft();
                      karel.turnLeft();
                   }
               }
    }
}
