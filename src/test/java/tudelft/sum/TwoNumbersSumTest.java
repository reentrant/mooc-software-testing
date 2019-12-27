package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void test01(){
        TwoNumbersSum dut = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(4);
        first.add(2);
        ArrayList<Integer> second = new ArrayList<>();
        second.add(4);
        second.add(6);
        second.add(5);
        ArrayList<Integer> result = dut.addTwoNumbers(first, second);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8, 0, 7));

        Assertions.assertTrue(expected.equals(result));
    }

}
