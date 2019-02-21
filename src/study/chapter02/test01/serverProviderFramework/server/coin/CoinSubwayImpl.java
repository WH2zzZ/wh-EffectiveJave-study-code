package study.chapter02.test01.serverProviderFramework.server.coin;

//一卡通地铁进出服务实现

import study.chapter02.test01.serverProviderFramework.SubwayInterface;

public class CoinSubwayImpl implements SubwayInterface {

    @Override
    public boolean in() {
        System.out.println("通过投币进入地铁");
        return false;
    }

    @Override
    public boolean out() {
        System.out.println("通过投币出地铁");
        return false;
    }

}
