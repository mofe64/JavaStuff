package designpatterns.strategy.duckExample.carexample.acceleration;

import designpatterns.strategy.duckExample.carexample.acceleration.Acceleration;

public class SlowAcceleration implements Acceleration {
    @Override
    public void accelerate() {
        System.out.println("0-60 in 60 seconds ...");
    }
}
