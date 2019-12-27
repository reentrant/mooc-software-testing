package week02;

public class RandomWalkers {


    public static void main(String []args) {
        int distance, x, y;
        int steps;

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int total = 0;

        for (int i = 0; i < trials; i++) {
            steps = 0;
            distance = 0;
            x = 0;
            y = 0;
            while(distance != r) {
                double direction = Math.random();
                if (direction < 0.25) {          // North
                    y += 1;
                } else if (direction < 0.50) {     // East
                    x -= 1;
                } else if (direction < 0.75) {    // South
                    y -= 1;
                } else {                          // West
                    x += 1;
                }
                distance = Math.abs(x) + Math.abs(y);
                steps++;
            }
            total += steps;
        }

        double average = (double) total / trials;
        System.out.println("average number of steps = " + average);
    }
}
