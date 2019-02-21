package study.chapter02.test01.serverProviderFramework.server.coin;

import study.chapter02.test01.serverProviderFramework.ServiceManager;
import study.chapter02.test01.serverProviderFramework.SubwayInterface;
import study.chapter02.test01.serverProviderFramework.SubwayProviderInterface;

public class CoinSubwayProviderImpl implements SubwayProviderInterface {

    static {
        ServiceManager.registerProvider("投币", new CoinSubwayProviderImpl());
    }

    @Override
    public SubwayInterface getService() {
        return new CoinSubwayImpl();
    }
}
