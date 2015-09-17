
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duttr4019
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city for the robot to live in.
        City gotham = new City();
        
        //Make things in the city.
       new Thing (gotham, 1, 1);
       new Thing (gotham, 1, 2);
       new Thing (gotham, 1, 3);
       new Thing (gotham, 1, 4);
       new Thing (gotham, 1, 5);
       new Thing (gotham, 1, 6);
       new Thing (gotham, 1, 7);
       new Thing (gotham, 1, 8);
       new Thing (gotham, 1, 9);
       new Thing (gotham, 1, 10);
       
        //Make a robot to live in the city.
        Robot Batman = new Robot(gotham, 1, 0, Direction.EAST);
        
        //Have Batman pick up 7 of the things and walk past the last three.
       Batman.move();
       while (Batman.canPickThing())
       {
       if(Batman.countThingsInBackpack()!=7)
       {
           Batman.pickThing();
           Batman.move();
       }
       else if(Batman.getAvenue()!= 11)
               {
                   Batman.move();
               }
       }
       
            
        
        

    }
}
