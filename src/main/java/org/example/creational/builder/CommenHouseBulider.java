package org.example.creational.builder;

public class CommenHouseBulider extends HouseBulider {
    @Override
    public void bulidBaies() {
        System.out.println("打普通房子地基");
    }

    @Override
    public void bulidWall() {
        System.out.println("建造普通房子墙");
    }

    @Override
    public void roofed() {
        System.out.println("封顶");
    }
}
