
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duttr4019
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in.
        City gotham = new City();
        
        //Create the hurdle race track.
        new Wall (gotham, 3, 0, Direction.SOUTH);
        new Wall (gotham, 3, 1, Direction.SOUTH);
        new Wall (gotham, 3, 2, Direction.SOUTH);
        new Wall (gotham, 3, 3, Direction.SOUTH);
        new Wall (gotham, 3, 4, Direction.SOUTH);
        new Wall (gotham, 3, 5, Direction.SOUTH);
        new Wall (gotham, 3, 6, Direction.SOUTH);
        new Wall (gotham, 3, 7, Direction.SOUTH);
        new Wall (gotham, 3, 8, Direction.SOUTH);
        new Wall (gotham, 3, 0, Direction.EAST);
        new Wall (gotham, 3, 1, Direction.EAST);
        new Wall (gotham, 3, 3, Direction.EAST);
        new Wall (gotham, 3, 6, Direction.EAST);
        
    }
}
