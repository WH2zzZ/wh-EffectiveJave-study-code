package study.chapter03.test18.decorator_pattern;

public class ConcreteDecoratorA extends Decorator{

    @Override
    public void operation() {
        super.operation();//先运行原Component的operation(),再执行本类的功能，相当于对原Component进行了装饰
        addedBehavior();
    }
    
    private void addedBehavior() {
        System.out.println("增加了新方法1");
    }

}