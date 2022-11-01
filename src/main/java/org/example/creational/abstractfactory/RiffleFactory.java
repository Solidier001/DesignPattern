package org.example.creational.abstractfactory;

public class RiffleFactory implements Factory {
    @Override
    public Bullet getbullet() {
        return new RifleBullet();
    }

    @Override
    public Bullet[] getbullet(int num) {
        Bullet[] rifleBullet= new RifleBullet[num];
        for (int i=0;i<num;i++)rifleBullet[i]=new RifleBullet();
        return rifleBullet;
    }

    @Override
    public Gun getgun() {
        return new Rifle();
    }
}
