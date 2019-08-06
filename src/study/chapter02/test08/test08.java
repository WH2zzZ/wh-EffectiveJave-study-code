package study.chapter02.test08;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.OutputStream;

public class test08 {

    /**
     * try-resource：释放资源速度测试
     */
    @Test
    public void demo01() throws Throwable {
        try(ResourceClose resourceClose = new ResourceClose()) {
            resourceClose.run();
            OutputStream
        }
    }

    /**
     * finalizer: 释放资源速度测试
     * @throws Throwable
     */
    @Test
    public void demo02() throws Throwable {
        ResourceFinalizer resourceFinalizer = new ResourceFinalizer();
        resourceFinalizer = null;
        Long sum = 0L;
        System.gc();
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
    }

}
