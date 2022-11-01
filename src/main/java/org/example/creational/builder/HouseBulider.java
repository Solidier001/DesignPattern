package org.example.creational.builder;

public abstract class HouseBulider {
    protected House house=new House();

    public abstract void bulidBaies();
    public abstract void bulidWall();
    public abstract void roofed();

    public House bulid(){
        return house;
    }
}
