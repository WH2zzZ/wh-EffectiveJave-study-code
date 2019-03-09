package study.chapter03.test15.packages;

public class StudentProtect {

    /**
     * 子类不可访问,只有同包下的可以
     */
    protected void protectMethod(){
        System.out.println("protected修饰的方法被访问");
    }
}
