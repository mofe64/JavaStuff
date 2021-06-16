package designpatterns.strategy.duckExample.carexample.acceleration;

import designpatterns.strategy.duckExample.carexample.acceleration.Acceleration;

public class MediumAcceleration implements Acceleration {
    @Override
    public void accelerate() {
        System.out.println("0-60 in 10 seconds ...");
    }
}
