package org.example.creational.abstractfactory;

public class Rifle extends Gun  {
    @Override
    public int getCapacity() {
        return 30;
    }

    @Override
    protected void shoot() {
        System.out.println("步枪射击");
        while (!magazine.empty())magazine.pop();
    }
}
