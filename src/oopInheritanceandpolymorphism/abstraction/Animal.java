package oopInheritanceandpolymorphism.abstraction;

public abstract class Animal {
    private int eyes;
    private String name;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void move();
}
