package study.chapter02.test13;

import java.util.Objects;

/**
 * 查看Cloneable接口实际上可以发现里面什么方法都没有，clone方法却来自Object类，
 * 继承了Cloneable接口为什么就能重写clone方法了呢？
 * 原因在于clone方法在Object类中的修饰符是protected，
 * 而Cloneable接口和Object处于同一个包下，熟悉修饰符的都知道protected的权限限定在同一个包下或者其子类。
 * Cloneable和Object同属于一个包，Cloneable自然能继承clone方法，继承了Cloneable接口的成为了它的子类同样也就继承了clone方法。
 */
public class Person implements Cloneable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
