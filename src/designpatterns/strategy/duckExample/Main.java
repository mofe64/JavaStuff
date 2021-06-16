package designpatterns.strategy.duckExample;

public class Main {
    public static void main(String[] args) {
        FlyBehavior cannotFlyBehavior = new CannotFly();
        Duck duck =  new Duck(cannotFlyBehavior);
        duck.fly();
        FlyBehavior limitedFlying = new LimitedFlying();
        duck.setFlyBehavior(limitedFlying);
        duck.fly();
        FlyWithWings flying = new FlyWithWings();
        duck.setFlyBehavior(flying);
        duck.fly();
    }
}
