public class WorldMap {
    public static void main(String[] args) {
        int canvasWidth = StdIn.readInt();
        int canvasHeight = StdIn.readInt();

        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        StdDraw.setXscale(0, canvasWidth);
        StdDraw.setYscale(0, canvasHeight);

        // StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        // plot points, one at a time
        while (!StdIn.isEmpty()) {
            // Label
            StdIn.readString();
            int numVertices = StdIn.readInt();
            double [] x = new double[numVertices];
            double [] y = new double[numVertices];
            for (int i = 0; i < numVertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);

        }
        // display all of the points now
        StdDraw.show();
    }
}
