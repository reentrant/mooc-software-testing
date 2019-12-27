package week01;

/**
 * Write a program week01.RightTriangle that takes three int command-line arguments and determines whether they constitute
 * the side lengths of some right triangle.
 * The following two conditions are necessary and sufficient:
 *
 * Each integer must be positive.
 * The sum of the squares of two of the integers must equal the square of the third integer.
 */
public class RightTriangle {

    public static void main(String [] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean eval = (a > 0) && (b > 0) && (c > 0);
        eval = eval && ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b));
        System.out.println(eval);
    }

}
