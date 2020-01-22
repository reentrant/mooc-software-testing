/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t;
        if (s.hasNextInt()) {
            t = s.nextInt();
            s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < t && s.hasNextLine(); i++) {
                int [] stack = new int[3];
                int strength = 0;
                int thickness = 0;
                for (int j = 0; j < 4 && s.hasNextInt(); j++) {
                    if (j == 0) {
                        strength = s.nextInt();
                    }
                    else {
                        stack[j - 1] = s.nextInt();
                        thickness += stack[j - 1];
                    }
                }
                breakBricks(strength, thickness, stack);
            }
        }
        System.out.flush();
        s.close();
    }

    public static void breakBricks(int strength, int total, int [] array) {
        //System.out.print("S= " + strength + ", thickness= "+ total +   ", array= " + Arrays.toString(array));
        int hits = 0;
        if (strength >= total){
            hits += 1;
        } else {
            Arrays.sort(array);
            total = 0;

            for (int i = 0; i < array.length; i++) {
                total += array[i];
                if (total < strength) {
                    if (i == array.length - 1) {
                        hits += 1;
                    }
                } else {
                    hits += 1;
                    total = 0;
                }
            }
        }
        System.out.println(hits);
    }
}
