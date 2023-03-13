package org.example.structural.Decorator;

public abstract class Decorator extends Component {
    Component component;
    @Override
    public void display() {
        component.display();
    }

    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
