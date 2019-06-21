package tudelft.mirror;

import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void test01(){
        Mirror dut = new Mirror();
        String result = dut.mirrorEnds("abXYXba");
        System.out.println(result);
        result = dut.mirrorEnds("abXXba");
        System.out.println(result);
        result = dut.mirrorEnds("aba");
        System.out.println(result);
    }
}
