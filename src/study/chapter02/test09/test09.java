package study.chapter02.test09;

import org.junit.jupiter.api.Test;
import study.chapter02.test08.ResourceClose;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test09 {

    /**
     * 传统的资源释放方式try-catch-finally：
     */
    @Test
    public void demo01(){
        byte[] b = new byte[1024];

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("my.txt");
            int data = fis.read();
            while(data != -1) {
                data = fis.read(b);
            }

            //使用printStackTrace()方法打印异常,会抛出每一个异常信息
            throw new RuntimeException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(new String(b));
    }

    @Test
    public void demo02() throws IOException {
        byte[] b = new byte[1024];

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(new File("my.txt"));
            int data = fis.read();
            while (data != -1) {
                data = fis.read(b);
            }
            //使用throw抛出异常,只会抛出最后一个异常,前面的异常会被抑制住
            throw new RuntimeException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    throw new IOException();
                } catch (IOException e) {
//                    e.printStackTrace();
                    throw new NullPointerException();
                }
            }
        }

        System.out.println(new String(b));
    }

    @Test
    public void demo03(){
        byte[] b = new byte[1024];

        try(FileInputStream fis = new FileInputStream("my.txt")) {
            int data = fis.read();
            while (data != -1) {
                data = fis.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(new String(b));
    }

    @Test
    public void demo04() throws IOException {
        byte[] b = new byte[1024];

        try (FileInputStream fis = new FileInputStream("my.txt")) {
            int data = fis.read();
            while (data != -1) {
                data = fis.read(b);
            }
            throw new RuntimeException();
        }
    }

    /**
     * try-resource：释放资源速度测试
     */
    @Test
    public void demo05() throws Throwable {
        try(ResourceClose resourceClose = new ResourceClose()) {

        }
    }
}
