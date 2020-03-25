public class Checkerboard {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double halfLength = 1.0 / 2.0;

        double y1 = halfLength;
        StdDraw.setScale(0, n);
        for (int i = 0; i < n; i++) {
            double x1 = halfLength;
            boolean cellIsBlue = i % 2 == 0;
            for (int j = 0; j < n; j++) {
                if (cellIsBlue) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                } else {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                }
                StdDraw.filledSquare(x1, y1, halfLength);
                cellIsBlue = !cellIsBlue;
                x1 += 1;
            }
            y1 += 1;
        }
    }
}
