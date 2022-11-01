package org.example.creational.abstractfactory;

public class PistolFactory implements Factory {
    @Override
    public Bullet getbullet() {
        return new PistolBullet();
    }

    @Override
    public Bullet[] getbullet(int num) {
        Bullet[] PistolBullets= new PistolBullet[num];
        for (int i=0;i<num;i++)PistolBullets[i]=new PistolBullet();
        return PistolBullets;
    }

    @Override
    public Gun getgun() {
        return new Pistol();
    }
}
