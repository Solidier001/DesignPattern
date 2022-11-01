package org.example.creational.factorymethed;

public class JavaVideoFactory extends Factory {
    @Override
    public Video produce() {
        return new JavaVideo();
    }
}
