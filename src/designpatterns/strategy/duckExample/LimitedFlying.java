package designpatterns.strategy.duckExample;

public class LimitedFlying implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot fly for very long ...");
    }
}
