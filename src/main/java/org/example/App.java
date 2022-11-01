package org.example;

import org.example.creational.factorymethed.Factory;
import org.example.creational.factorymethed.JavaVideoFactory;
import org.example.creational.factorymethed.Video;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Factory factory=new JavaVideoFactory();
        Video video=factory.produce();
        video.play();
    }
}
