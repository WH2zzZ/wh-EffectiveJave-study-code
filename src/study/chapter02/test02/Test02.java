package study.chapter02.test02;

import org.junit.jupiter.api.Test;
import study.chapter02.test02.builder.NyPizza;
import study.chapter02.test02.builder.Pizza;

import static study.chapter02.test02.builder.NyPizza.Size.SMALL;
import static study.chapter02.test02.builder.Pizza.Topping.ONION;
import static study.chapter02.test02.builder.Pizza.Topping.SAUSAGE;

public class Test02 {

    @Test
    void testBuilder(){
        Person person = new Person.Builder("wanghan").birthday(1234567890).build();
        System.out.println(person);

    }

    /**
     * 集合 , 枚举 , 泛型3大块知识的严重不足!!!
     */
    @Test
    void testPizza(){
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
//        Pizza.Builder pizzaBuilder = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION);
//        NyPizza pizza = (NyPizza) pizzaBuilder.build();
        System.out.println(nyPizza);

    }
}
