package study.chapter06.test39;

public class Sample {

    /**
     * 静态方法
     */
    @Test
    public static void m1(){}

    public static void m2(){}

    @Test
    public static void m3(){
        //Test should fail
        throw new RuntimeException("Boom");
    }

    /**
     * 非静态方法
     */
    public void m4(){}

    @Test
    public void m5(){}

    @Test
    public void m6(){
        //Test should fail
        throw new RuntimeException("Boom");
    }
}
