//import java.util.Arrays;

/** Birthday Paradox:
 * Let’s figure out the real chances of each person picking a different number:
 * The first person has a 100% chance of a unique number (of course)
 * The second has a (1 – 1/365)
 * The third has a (1 – 2/365)
 *
 * Now, solving duplicate birthday:
 *
 * i: number of people
 * count: The count number of times that exactly i people entered the room
 * fraction: the fraction of times that i or fewer people enter the room
 */
public class Birthday {

    public static void main(String [] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int [] count = new int[n];
        int [] cumSums = new int[n];
        int total = 0;

        for (int j = 0; j < trials; j++) {
            int [] peopleInTheRoom = new int[n];
            // Choose a birtday for the next person, between 0 and n-1
            for (int i = 0; i < n; i++) {
                int nextPersonId = (int) (Math.random() * (n - 1));
                if (peopleInTheRoom[nextPersonId] == 0) {
                    peopleInTheRoom[nextPersonId]++;
                } else {  // It is a duplicate birthday!!!
                    count[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            total += count[i];
            cumSums[i] = total;
            double fraction = 1.0 * cumSums[i] / trials;
            System.out.println(i + 1 +  "\t" + count[i] + "\t" + fraction);
            if (fraction > 0.5)
                break;
        }
    }

}
