//import java.util.Arrays;

public class ThueMorse {
    public static void main(String [] args) {
        int n = Integer.parseInt(args[0]);
        int [] basicSequence = {0};
        // 1. what is the thue seq length?
        int thueLen = (int) Math.pow(2, Math.ceil(Math.log10(n) / Math.log10(2)));

        // TODO: Construct the Thue Morse sequence
        int [] thueSequence = new int[thueLen];


        int start = basicSequence.length;
        int end = 2 * basicSequence.length;
        int original_index = 0;
        thueSequence[original_index] = basicSequence[original_index];
        for (int j = 0; start + j < thueLen; j++) {
            if (start + j == end) {
                start = end;
                end *= 2;
                j = 0;
            }
            thueSequence[start + j] = thueSequence[j] ^ 1;
        }
//        System.out.println(Arrays.toString(thueSequence));

        // TODO: build a n x n pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueSequence[i] == thueSequence[j]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}