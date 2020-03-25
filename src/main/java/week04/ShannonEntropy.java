/**
 * The Shannon entropy is a measure of the rate of information produced by a random source, such as
 * the outcomes of flipping a fair coin or rolling a loaded die. It is a fundamental concept in
 * information theory and data compression.
 */
public class ShannonEntropy {

    public static void main(String[] args) {
        int arraySize = Integer.parseInt(args[0]);
        int [] frequencyCounters = new int[arraySize];
        double [] p = new double[arraySize];
        double [] pLogp = new double[arraySize];

        int n = 0;
        double shannonEntropy = 0;
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            n++;
            frequencyCounters[i - 1]++;
        }
        for (int j = 0; j < arraySize; j++) {
            p[j] = (double) frequencyCounters[j] / n;
            if (p[j] >  0) {
                pLogp[j] = -1 * p[j] * Math.log10(p[j]) / Math.log10(2.0);
                shannonEntropy += pLogp[j];
            }
        }
        StdOut.printf("%.4f", shannonEntropy);
    }
}
