package org.example.creational.singleton;

import java.util.Date;

public class HungrySingleton {
    private final static HungrySingleton instance=new HungrySingleton();

    private String id;
    private Date date;
    private String name;

    private HungrySingleton() {
        this.id="1";
        this.date=new Date();
        this.name="ass";
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "HungrySingleton{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
