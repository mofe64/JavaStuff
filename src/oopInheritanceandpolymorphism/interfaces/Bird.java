package oopInheritanceandpolymorphism.interfaces;

public class Bird implements Flyable, Walkable{
    @Override
    public void fly() {
        System.out.println("FLYING AWAY");
    }

    @Override
    public void walk() {
        System.out.println("WALKING BACK");
    }
}
