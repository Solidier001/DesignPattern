package org.example.creational.factorymethed;

public class PythonVideoFactory extends Factory {
    @Override
    public Video produce() {
        return new PythonVideo();
    }
}
