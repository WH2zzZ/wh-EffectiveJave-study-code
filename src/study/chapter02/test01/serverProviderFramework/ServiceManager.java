package study.chapter02.test01.serverProviderFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceManager {
  
    private ServiceManager() {  
  
    }  
  
    private static final Map<String, SubwayProviderInterface> providers = new ConcurrentHashMap<>();
  
    public static void registerProvider(String name, SubwayProviderInterface p) {  
        providers.put(name, p);
    }  
  
    public static SubwayInterface getService(String name) {
  
        SubwayProviderInterface p = providers.get(name);
  
        if (p == null) {  
            throw new IllegalArgumentException(  
                    "No provider registered with name:" + name);  
        }  
  
        return p.getService();  
  
    }  
  
}  