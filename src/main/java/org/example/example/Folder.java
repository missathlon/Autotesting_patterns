package org.example.example;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("org.example.example.Folder: " + name);
        for (Component component : components) {
            component.display();
        }
    }
}
