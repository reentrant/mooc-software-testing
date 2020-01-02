package week03;

/**
 * Discrete distribution. Write a program week03.week03.DiscreteDistribution.DiscreteDistribution.java that takes an integer command-line argument m,
 * followed by a sequence of positive integer command-line arguments a1, a2, …, an, and prints m random indices
 * (separated by whitespace), choosing each index i with probability proportional to ai.
 */

public class DiscreteDistribution {
        public static void main(String []args) {
            int m = Integer.parseInt(args[0]);
            int n = args.length - 1;
            int [] argInts = new int[n];
            int [] cumSums = new int[n];

            int total = 0;
            for (int i = 0; i < n; i++) {
                argInts[i] = Integer.parseInt(args[i + 1]);
                total += argInts[i];
                cumSums[i] = total;
            }

            int index;
            for (int i = 0; i < m; i++) {
                // Pick a random integer between 0 and Sn - 1
                int r = (int) (Math.random() * (total - 1));
                for (int j = 0; j < n; j++) {
                    if (r < cumSums[j]) {
                        index = j + 1;
                        System.out.print(index + " ");
                        break;
                    }
                }
            }
    //        System.out.println();
    //        System.out.println(Arrays.toString(argInts));
    //        System.out.println(Arrays.toString(cumSums));
        }

}
