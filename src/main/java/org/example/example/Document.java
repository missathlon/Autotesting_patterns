package org.example.example;

public class Document implements Component {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("org.example.example.Document: " + name);
    }
}
