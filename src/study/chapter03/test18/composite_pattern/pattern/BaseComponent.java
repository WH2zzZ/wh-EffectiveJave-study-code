package study.chapter03.test18.composite_pattern.pattern;

abstract public class BaseComponent {
    public abstract void add(BaseComponent c); //增加成员
    public abstract void remove(BaseComponent c); //删除成员
    public abstract BaseComponent getChild(int i); //获取成员
    public abstract void operation();  //业务方法
}  