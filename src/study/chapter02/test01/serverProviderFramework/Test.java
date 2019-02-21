package study.chapter02.test01.serverProviderFramework;

import study.chapter02.test01.serverProviderFramework.server.card.CardSubwayProviderImpl;

/**
 * 客户端测试类 
 * @author Administrator 
 * 
 */  
public class Test {  
  
    /** 
     * @param args 
     * @throws ClassNotFoundException  
     */  
    public static void main(String[] args) throws ClassNotFoundException {

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
}  