package org.example.creational.abstractfactory;

public class Pistol extends Gun {
    @Override
    public int getCapacity() {
        return 20;
    }

    @Override
    protected void shoot() {
        System.out.println("手枪射击");
        magazine.pop();
    }
}
