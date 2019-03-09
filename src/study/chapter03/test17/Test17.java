package study.chapter03.test17;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.math.BigInteger;
import java.util.BitSet;

public class Test17 {

    @Test
    public void demo01(){
        BigInteger x = new BigInteger("11");
        System.out.println(x.flipBit(0));

        BitSet y = new BitSet(11);
        y.flip(0);
        System.out.println(y);
    }
}
