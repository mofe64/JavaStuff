package designpatterns.strategy.duckExample.carexample.door;

public class AutomaticDoor implements Door{
    @Override
    public void open() {
        System.out.println("Opening doors ...");
    }
}
