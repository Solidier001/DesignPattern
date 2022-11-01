package org.example.creational.singleton;

import java.util.Date;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance=null;
    private static int count=0;

    private String id;
    private Date date;
    private String name;

    private LazyDoubleCheckSingleton() {
        id="1";
        date=new Date();
        name="ass";
    }
    public static LazyDoubleCheckSingleton getInstance() {
        try {
        if (instance==null)synchronized (LazyDoubleCheckSingleton.class){
            Thread.sleep(100);
            if (instance==null){instance=new LazyDoubleCheckSingleton();
            count++;}
            System.out.println(count);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        return instance;
    }

    @Override
    public String toString() {
        return "LazyDoubleCheckSingleton{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
