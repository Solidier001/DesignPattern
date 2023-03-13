package org.example.structural.Decorator;

import org.example.structural.Decorator.Components.Window;
import org.example.structural.Decorator.Decorators.ScrollBarDecorator;

public class Client {
    public  static void main(String args[]){
        Component component,componentSB;  //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();
    }
}
