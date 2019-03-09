package study.chapter03.test16;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class Test16 {

    @Test
    public void demo01(){
        /**
         * 直接暴露了数据域
         */
        Point point = new Point();
        point.x = 1;
        Dimension dimension = new Dimension();
    }
}
