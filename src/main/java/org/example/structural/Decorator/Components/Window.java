package org.example.structural.Decorator.Components;

import org.example.structural.Decorator.Component;

public class Window extends Component {
    @Override
    public void display() {
        System.out.println("窗口展示");
    }
}
