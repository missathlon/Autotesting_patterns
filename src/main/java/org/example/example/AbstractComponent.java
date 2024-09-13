package org.example.example;

public abstract class AbstractComponent implements Component {
    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    public abstract String getName();

    public static class ConcreteComponent extends AbstractComponent {

        public ConcreteComponent(String name) {
            super(name);
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void display() {

        }
    }
}
