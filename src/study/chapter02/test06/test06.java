package study.chapter02.test06;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

class test06 {

    @Test
    public void test1(){
        Integer.valueOf("123");
        new Integer("123");
    }

    @Test
    public void test2(){
        long startTime = System.currentTimeMillis();

//        long sum = 0L;
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println("用时" + (double)(endTime - startTime) / 1000);

    }
}
