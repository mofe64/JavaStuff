package oopInheritanceandpolymorphism.inheritance;

public class Dog extends Animal{

    public Dog() {
        super("test");
        System.out.println("creating Dog class");
    }

    @Override
    public void fly(){
       //
    }
    @Override
    public void breatheUnderWater(){
        //
    }

    public void dogCanFly(){
        super.fly();
    }



}
