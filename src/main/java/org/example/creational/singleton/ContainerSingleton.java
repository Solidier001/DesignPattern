package org.example.creational.singleton;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    private static Map<String,Object> Container=null;

    private ContainerSingleton(){}

    public static void Config(Object ContainerObj){
        if (Container!=null) throw new  RuntimeException("Container had been initialized");
        Container= (Map<String, Object>) ContainerObj;
    }
    public static void DefaultConfig() {
        if (Container!=null) throw new  RuntimeException("Container has been initialized");
        Container= new  HashMap<String, Object>();
    }

    public static void addObj(String name,Object obj){
        if (Container.containsKey(name)) throw new RuntimeException("This name has been had by a object");
        Container.put(name,obj);
    }

    public static Object getObj(String name){
        return Container.get(name);
    }
}
