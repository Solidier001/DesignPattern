package org.example.creational.builder;

public class HighHouseBulider extends HouseBulider {
    @Override
    public void bulidBaies() {
        System.out.println("打高楼房子地基");
    }

    @Override
    public void bulidWall() {
        System.out.println("建造高楼房子墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
