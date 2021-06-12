package oopInheritanceandpolymorphism.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Bird();
        Animal animal2 = new Dog();
        Animal animal3 = new Fish();
        Flyable flyingDog2 = new FlyingDog();
        Swim flyingDog3 = new FlyingDog();
        Walkable flyingDog4 = new FlyingDog();

        Animal[] test = {animal1, animal2, animal3};

        for (Animal a : test) {
            a.move();
            if (a.getClass() == Fish.class) {
                ((Fish) a).swimDeep();
            }
        }
    }
}
