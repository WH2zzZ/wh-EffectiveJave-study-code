package study.chapter03.test15.packages;


import org.junit.jupiter.api.Test;

public class Test15{

    @Test
    public void demo01(){
        StudentProtect studentProtect = new StudentProtect();
        studentProtect.protectMethod();
    }

}
