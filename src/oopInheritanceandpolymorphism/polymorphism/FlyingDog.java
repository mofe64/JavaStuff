package oopInheritanceandpolymorphism.polymorphism;

public class FlyingDog extends Dog implements Flyable, Walkable, Swim{
    @Override
    public void fly() {
        System.out.println("This dog can fly");
    }

    @Override
    public void swim() {
        System.out.println("This dog can swim");
    }

    @Override
    public void walk() {
        System.out.println("This dog can walk");
    }
}
