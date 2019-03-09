package study.chapter03.test18.decorator_pattern;

public class ConcreteDecoratorB extends Decorator{

    private String addedState;
    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("增加了新方法2");
    }
    

}