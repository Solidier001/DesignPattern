package org.example.creational.prototype.clone;

import java.util.Date;

public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Pig() {
        System.out.println("Constructor");
    }
    static  {
        System.out.println("Not Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public Pig clone() throws CloneNotSupportedException {
        Pig pig=(Pig)super.clone();
        pig.birthday=((Date) birthday.clone());
        return pig;
    }
}
