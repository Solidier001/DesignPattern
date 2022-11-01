package org.example.creational.singleton;

import java.util.Date;

public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }

    private String id;
    private Date date;
    private String name;

    private StaticInnerClassSingleton() {
        id="1";
        date=new Date();
        name="ass";
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
