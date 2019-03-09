package study.chapter03.test18.composite_pattern.pattern;

import java.util.ArrayList;

class Composite extends BaseComponent {
    private ArrayList<BaseComponent> list = new ArrayList<BaseComponent>();
      
    public void add(BaseComponent c) {
        list.add(c);  
    }  
      
    public void remove(BaseComponent c) {
        list.remove(c);  
    }  
      
    public BaseComponent getChild(int i) {
        return (BaseComponent)list.get(i);
    }  
      
    public void operation() {  
        //容器构件具体业务方法的实现  
        //递归调用成员构件的业务方法  
        for(Object obj:list) {  
            ((BaseComponent)obj).operation();
        }  
    }     
}