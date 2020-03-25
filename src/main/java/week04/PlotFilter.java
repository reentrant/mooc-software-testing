/******************************************************************************
 *  Compilation:  javac PlotFilter.java
 *  Execution:    java PlotFilter < input.txt
 *  Dependencies: StdDraw.java StdIn.java
 *  
 *  % java PlotFilter < USA.txt
 *
 *  Datafiles:    http://introcs.cs.princeton.edu/java/15inout/USA.txt
 *
 ******************************************************************************/

public class PlotFilter { 

    public static void main(String[] args) {

        // read coords of bounding box
        double xMin = StdIn.readDouble();
        double yMin = StdIn.readDouble();
        double xMax = StdIn.readDouble();
        double yMax = StdIn.readDouble();
        // rescale
        StdDraw.setXscale(xMin, xMax);
        StdDraw.setYscale(yMin, yMax);

        // for bigger points
        StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        StdDraw.enableDoubleBuffering();

        // plot points, one at a time
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }

        // display all of the points now
        StdDraw.show();

    }
}
