package org.example.structural.Decorator.Decorators;

import org.example.structural.Decorator.Component;
import org.example.structural.Decorator.Decorator;

public class BlackBordeDecorator extends Decorator {

    public BlackBordeDecorator(Component component) {
        super(component);
    }

    public BlackBordeDecorator() {
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    public  void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
