package designpatterns.strategy.duckExample.carexample.door;

public class SuicideDoor implements Door {
    @Override
    public void open() {
        System.out.println("Doors opening up ...");
    }
}
