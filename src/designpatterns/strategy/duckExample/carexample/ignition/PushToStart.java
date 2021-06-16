package designpatterns.strategy.duckExample.carexample.ignition;

public class PushToStart implements Ignition {
    @Override
    public void start() {
        System.out.println("Gather boys tp push ...");
    }
}
