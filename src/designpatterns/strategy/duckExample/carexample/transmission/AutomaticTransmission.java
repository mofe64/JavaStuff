package designpatterns.strategy.duckExample.carexample.transmission;

public class AutomaticTransmission implements Transmission {
    @Override
    public void shiftGears() {
        System.out.println("PRNDL...");
    }
}
