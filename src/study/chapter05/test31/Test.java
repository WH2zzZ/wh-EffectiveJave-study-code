package study.chapter05.test31;

public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        //父类引用的是父类本身,运行会报错,也就是只有先经过向上转型的对象才能继续向下转型。
        Person person = new Person();
        person.setAge(1);
        person.setName("wh");

        //运行报错
        Man man = (Man)person;
        System.out.println(man);
    }

    @org.junit.jupiter.api.Test
    public void test2(){
        Person person = new Man();
        person.setAge(1);
        person.setName("wh");

        //运行报错
        Man man = (Man)person;
        System.out.println(man);
    }
}
