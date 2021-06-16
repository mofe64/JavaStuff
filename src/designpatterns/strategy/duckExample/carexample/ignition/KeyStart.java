package designpatterns.strategy.duckExample.carexample.ignition;

public class KeyStart implements Ignition {
    @Override
    public void start() {
        System.out.println("Starting ....");
    }
}
