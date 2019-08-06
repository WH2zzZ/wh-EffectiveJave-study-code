package study.chapter05.test30;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class E_vs_ {

    @Test
    public void test01(){
        //在声明变量属性时,不明确是什么类型的时候,可以使用?而不可以使用T
        Demo1<?> demo1;
//        Demo1<T> demo2;

        demo1 = new Demo1<String>();
//        demo1.t1 = "asd";//声明失败,这个时候是因为没有指定T的参数类型

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list);

        demo1.swapList(list);

        List<Object> list1 = Arrays.asList(1, "s", true);
        List<Object> list2 = new ArrayList<>(list1);
        System.out.println(list1);
        System.out.println(list2);
    }

    @Test
    public void test02(){
//        String[] strings = pickTwo("java", "python", "r");
//        Integer[] ints = pickTwo(1, 2, 3);
        Object[] a = new Object[2];
        a[0] = 1;
        a[1] = 2;

        Integer[] b = (Integer[]) a;

    }

    public static <T> T[] pickTwo(T a, T b, T c){
        switch (ThreadLocalRandom.current().nextInt(3)){
            case 0 : return toArray(a, b);
            case 1 : return toArray(a, c);
            case 2 : return toArray(b, c);
        }
        throw new AssertionError();
    }

    public static <T> T[] toArray(T... args){
        return args;
    }
}
