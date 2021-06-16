package designpatterns.strategy.duckExample;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings ...");
    }
}
