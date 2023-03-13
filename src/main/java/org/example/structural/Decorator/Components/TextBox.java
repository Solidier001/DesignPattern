package org.example.structural.Decorator.Components;


import org.example.structural.Decorator.Component;

public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("文本框展示");
    }
}
