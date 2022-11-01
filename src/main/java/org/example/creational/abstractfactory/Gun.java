package org.example.creational.abstractfactory;

import java.util.Stack;

public abstract class Gun {
    protected Stack<Bullet> magazine;

    public abstract int getCapacity() ;

    public void addBullets(Bullet[] Bulletsbox){
        if (getCapacity()>Bulletsbox.length) for (Bullet bullet: Bulletsbox)magazine.push(bullet);
        else for (int i=0;i<getCapacity();i++)magazine.push(Bulletsbox[i]);
    }

    protected abstract void shoot();
}
