public class HelloWorldTriangle {

    public static void main(String[] args) {
        // Triangle
        int x = 793;
        int y = 498;
        // StdDraw.setCanvasSize(x, y);

        double h = Math.sqrt(3.0 / 2.0);
        StdDraw.setPenRadius(0.005);
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, h);
        StdDraw.line(0.5, h, 0.0, 0.0);

        // Center
        StdDraw.point(0.5, h/3.0);
        // Text example
        StdDraw.text(0.5, 0.5, "Hello World");
    }
}
