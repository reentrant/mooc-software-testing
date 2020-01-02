// import java.util.Arrays;

public class ThueMorse {
    public static void main(String [] args) {
        int n = Integer.parseInt(args[0]);
        int [] basicSequence = {0};
        // 1. what is the thue seq length?
        int thueLen = (int) Math.pow(2, Math.ceil(Math.log10(n) / Math.log10(2)));

        // Construct the Thue Morse sequence
        int [] thueSequence = new int[thueLen];
        int start = basicSequence.length;
        int end = 2 * basicSequence.length;
        int originalIndex = 0;
        thueSequence[originalIndex] = basicSequence[originalIndex];
        for (int t = 0; start + t < thueLen; t++) {
            if (start + t == end) {
                start = end;
                end *= 2;
                t = 0;
            }
            thueSequence[start + t] = thueSequence[t] ^ 1;
        }
//        System.out.println(Arrays.toString(thueSequence));

        // build a n x n pattern
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
