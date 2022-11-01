package org.example.creational.abstractfactory;

interface Factory {
    Bullet getbullet();

    Bullet[] getbullet(int num);

    Gun getgun();
}
