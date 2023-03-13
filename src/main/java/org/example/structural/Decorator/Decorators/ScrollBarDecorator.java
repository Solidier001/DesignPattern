package org.example.structural.Decorator.Decorators;

import org.example.structural.Decorator.Component;
import org.example.structural.Decorator.Decorator;

public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public ScrollBarDecorator() {
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    public  void setScrollBar(){
        System.out.println("为构件增加滚动条！");
    }
}
