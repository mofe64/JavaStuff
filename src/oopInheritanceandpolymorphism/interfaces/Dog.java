package oopInheritanceandpolymorphism.interfaces;

public class Dog implements Walkable, Swim{
    @Override
    public void swim() {
        System.out.println("SWIMMING FOR A LITTLE BIT");
    }

    @Override
    public void walk() {
        System.out.println("GOING FOR A STROLL");
    }

}
