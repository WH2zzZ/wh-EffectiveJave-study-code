package study.chapter02.test01.serverProviderFramework.server.card;

import study.chapter02.test01.serverProviderFramework.ServiceManager;
import study.chapter02.test01.serverProviderFramework.SubwayInterface;
import study.chapter02.test01.serverProviderFramework.SubwayProviderInterface;

//对应  书中: 静态工厂
//该类可以不存在

public class CardSubwayProviderImpl implements SubwayProviderInterface {

    static {
        ServiceManager.registerProvider("一卡通", new CardSubwayProviderImpl());
    }

    @Override
    public SubwayInterface getService() {
        return new CarSubwayImpl();
    }
}
