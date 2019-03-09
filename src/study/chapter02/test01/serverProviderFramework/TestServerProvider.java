package study.chapter02.test01.serverProviderFramework;

import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

/**
 * 客户端测试类 
 * @author Administrator 
 * 
 */  
public class TestServerProvider {
  
    @Test
    public void test01() throws ClassNotFoundException {

        Class.forName("study.chapter02.test01.serverProviderFramework.server.card.CardSubwayProviderImpl");
        //ServiceManager.registerProvider("一卡通", new CardSubwayProviderImpl());
        Class.forName("study.chapter02.test01.serverProviderFramework.server.coin.CoinSubwayProviderImpl");
        //解耦
        SubwayInterface card = ServiceManager.getService("一卡通");
        card.in();
        card.out();

        System.out.println("======================================");

        SubwayInterface coin = ServiceManager.getService("投币");
        coin.in();
        coin.out();
    }

    @Test
    public void test02(){

    }
}  