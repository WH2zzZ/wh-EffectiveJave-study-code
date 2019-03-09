package study.chapter02.test01;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

//用静态工厂方法代替构造器
public class Test01 {

    /**
     * 第一大优势: 有名称
     */
    @Test
    public void testFactory(){
        //不知道这个构造函数是做什么的
        BigInteger result1 = new BigInteger(10, 2, new Random(200));
        //一眼就知道这个方法是干什么的
        BigInteger result2 = BigInteger.probablePrime(3, new Random(200));

        System.out.println(result1);
        System.out.println(result2);
    }
    

    /**
     * 第二大优势: 不必每次调用他们的时候都创建一个新的对象
     */
    @Test
    public void testBoolean(){
        /*
        public static final Boolean TRUE = new Boolean(true);
        public static final Boolean FALSE = new Boolean(false);
        
        public static Boolean valueOf(boolean b) {
            return (b ? TRUE : FALSE);
        }
        
        静态工厂能够为重复的调用返回相同的对象,有助于类严格控制某个时刻哪些类应该存在---实例受控的类
        实例受控的类: 
                    1.确保单例Singleton  Or  不可实例化
                    2.使得不可变的值的类确保不存在两个相同的实例(当且仅当a==b, a.equal(b)为true)
         */
        Boolean result = Boolean.valueOf(true);
        System.out.println(result);
    }

    /**
     * 第三大优势:返回原返回类型的任何子类型的对象
     *
     */
    @Test
    public void testCollections(){
        Set<String> singleton = Collections.singleton("2");
        int i = 0;
        int a = 1;
        try {
            int c = a / i;
        } catch (Exception e) {
            System.out.println("123");
        }

    }

    /**
     * JDBC中  Driver相当于服务提供者(静态工厂)   ConnectionImpl相当于服务具体实现类
     * 第五大优势: 方法返回的对象所属的类,在编写包含该静态工厂方法的类时可以不存在
     * @Author WangHan
     * @Date 18:32 2019/2/17
     * @Param []
     * @return void
     */
    @Test
    void testJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        /*
            "&serverTimezone=GMT%2B8"加入这个就不会报(争对8的mysql连接jar包)
            java.sql.SQLException: The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is unrecognized or represents more than one time zone. You must configure either the server or JDBC driver (via the serverTimezone configuration property) to use a more specifc time zone value if you want to utilize time zone support.
         */
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pmcenter?useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT%2B8", "root", "Brc@1234");) {

        }


    }
}
