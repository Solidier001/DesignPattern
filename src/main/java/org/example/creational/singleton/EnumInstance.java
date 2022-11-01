package org.example.creational.singleton;

import java.util.Date;

public enum EnumInstance {
    Instance1("1",new Date(),"a"),
    Instance2("2",new Date(),"b"),
    Instance3("3",new Date(),"c"),
    Instance4("4",new Date(),"d");

    private String id;
    private Date date;
    private String name;

    private EnumInstance(String id, Date date, String name) {
        this.id = id;
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnumInstance{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
