package oopInheritanceandpolymorphism.polymorphism;

public class Fish extends Animal{
    @Override
    public void move() {
        System.out.println("Swimming ...");
    }

    public void swimDeep(){
        System.out.println("Going deep ...");
    }
}
