package tudelft.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void whatType(){
        TwoNumbersSum objInstance = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList();
        first.add(5);
        first.add(6);
        ArrayList<Integer> second = new ArrayList();
        second.add(1);
        second.add(2);

        ArrayList<Integer> result = objInstance.addTwoNumbers(first, second);
        System.out.println(result);
    }

}
