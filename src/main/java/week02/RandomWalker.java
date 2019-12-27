package week02;

/**
 * Random walk. A Java programmer begins walking aimlessly. At each time step, she takes one step in a random direction
 * (either north, east, south, or west), each with probability 25%.
 * She stops once she is at Manhattan distance r from the starting point.
 * How many steps will the random walker take? This process is known as a two-dimensional random walk.
 *
 * Write a program week02.RandomWalker.java that takes an integer command-line argument r and simulates the motion of a random
 * walk until the random walker is at Manhattan distance r from the starting point.
 * Print the coordinates at each step of the walk (including the starting and ending points),
 * treating the starting point as (0, 0). Also, print the total number of steps taken.
 */
public class RandomWalker {
    public static void main(String []args) {

        int r = Integer.parseInt(args[0]);
        int distance = 0;
        double direction;
        int i, x = 0, y = 0;
        for (i = 0; distance != r; i++) {
            direction = Math.random();
            if (direction < 0.25) {          // North
                y += 1;
            } else if (direction < 0.50) {     // East
                x -= 1;
            } else if (direction < 0.75) {    // South
                y -= 1;
            } else {                          // West
                x += 1;
            }
            System.out.println("(" + x + ", " + y + ")");
            distance = Math.abs(x) + Math.abs(y);
        }
        System.out.println("steps = " + i);
    }
}
