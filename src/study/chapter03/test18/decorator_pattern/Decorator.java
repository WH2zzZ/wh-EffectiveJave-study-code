package study.chapter03.test18.decorator_pattern;

public abstract class Decorator implements Component{

    private Component mComponent;
    @Override
    public void operation() {
        if(mComponent != null) {
            //运行被修饰的类的方法
            mComponent.operation();
        }
    }
    
    protected void setComponent(Component cn) {
        this.mComponent = cn;
    }   

}