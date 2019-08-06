package study.chapter06.test34;

public class Test {

    @org.junit.Test
    public void test01(){
        int pay = PayrollDay.MONDAY.pay(12, 100);
        System.out.println(pay);
    }
}
