package org.example.creational.singleton;

import java.util.Date;

public class LazySingleton {
    private static LazySingleton instance=null;

    private String id;
    private Date date;
    private String name;

    private LazySingleton() {
        id="1";
        date=new Date();
        name="ass";
    }
    public static LazySingleton getInstance(){
        if (instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleton{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
