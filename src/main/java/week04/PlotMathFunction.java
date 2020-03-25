public class PlotMathFunction {
    /**
     * Plot y(x) = sin(4x) + sin(20x) in the interval (0, pi)
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double [] x = new double[n + 1];
        double [] y = new double[n + 1];


        for (int i = 0; i <= n; i++) {
            x[i] = Math.PI * i / n;
            y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
        }
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, 2.0);

        for (int j = 0; j < n; j++) {
            StdDraw.line(x[j], y[j], x[j + 1], y[j + 1]);
        }
    }
}
