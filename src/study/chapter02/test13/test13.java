package study.chapter02.test13;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test13 {

    /**
     *
     */
    @Test
    public void demo01() throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("wanghan");
        person.setAge(12);
        Person clonePerson = person.clone();

        boolean equals = person.equals(clonePerson);
        System.out.println(equals);

    }
}
