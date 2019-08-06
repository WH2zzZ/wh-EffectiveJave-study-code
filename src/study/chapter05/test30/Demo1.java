package study.chapter05.test30;

import java.util.List;


public class Demo1<T> {

    public T t1;

    private T t2;

    public T getT() {
        return t1;
    }

    public void setT(T t) {
        this.t1 = t;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public void swapList(List<?> l1){
        //声明list<?>, 就失去了对这个list的操作
//        l1.add("1");
        //解决方法使用一个辅助方法来捕捉通配符类型,但是也只是操作list内已有的元素,而不能往list添加新的元素
        swapElement(l1);
        System.out.println(l1);
    }

    private <E> void swapElement(List<E> l1) {
        E e = l1.get(0);
        l1.set(0, l1.get(1));
        l1.set(1, e);
    }
}
