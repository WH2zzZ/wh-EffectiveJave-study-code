package study.chapter02.test01.serverProviderFramework.server.card;

//一卡通地铁进出服务实现

import study.chapter02.test01.serverProviderFramework.SubwayInterface;

public class CarSubwayImpl implements SubwayInterface {

    @Override
    public boolean in() {
        System.out.println("通过一卡通进入地铁");
        return false;
    }

    @Override
    public boolean out() {
        System.out.println("通过一卡通出地铁");
        return false;
    }

}
