package study.chapter03.test15.demo;


import org.junit.jupiter.api.Test;
import study.chapter03.test15.packages.Interface;
import study.chapter03.test15.packages.StudentProtect;

public class Test15 extends StudentProtect implements Interface {

    /**
     * 下面这两种额外要注意
     *
     * 只需要看实例和当前调用该实例的类是否在同一包下面,在就可以调用protected方法
     * 不在就不可以调用
     */
    @Test
    public void demo01(){
        StudentProtect studentProtect = new StudentProtect();
        /**
         * 编译会报错
         */
//        studentProtect.protectMethod();
    }

    @Test
    public void demo02(){
        Test15 test15 = new Test15();
        test15.protectMethod();
    }

}
