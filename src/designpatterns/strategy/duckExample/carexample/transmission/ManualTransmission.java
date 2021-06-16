package designpatterns.strategy.duckExample.carexample.transmission;

public class ManualTransmission implements Transmission {
    @Override
    public void shiftGears() {
        System.out.println("Shifting from gear to gear ....");
    }
}
