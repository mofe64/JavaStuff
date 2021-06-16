package designpatterns.strategy.duckExample.carexample;

import designpatterns.strategy.duckExample.carexample.acceleration.Acceleration;
import designpatterns.strategy.duckExample.carexample.acceleration.FastAcceleration;
import designpatterns.strategy.duckExample.carexample.acceleration.MediumAcceleration;
import designpatterns.strategy.duckExample.carexample.door.Door;
import designpatterns.strategy.duckExample.carexample.door.SuicideDoor;
import designpatterns.strategy.duckExample.carexample.ignition.Ignition;
import designpatterns.strategy.duckExample.carexample.ignition.JumpStart;
import designpatterns.strategy.duckExample.carexample.ignition.PushToStart;
import designpatterns.strategy.duckExample.carexample.transmission.ManualTransmission;
import designpatterns.strategy.duckExample.carexample.transmission.Transmission;

public class Main {
    public static void main(String[] args) {
        Acceleration acceleration = new FastAcceleration();
        Ignition ignition = new PushToStart();
        Transmission transmission = new ManualTransmission();
        Door door = new SuicideDoor();

        Car car = new Car(acceleration, transmission, door, ignition);
        car.openDoor();
        car.start();
        car.shiftGears();
        car.accelerate();
        System.out.println("========================================");
        Acceleration mediumAcceleration = new MediumAcceleration();
        Ignition jumpStart = new JumpStart();
        car.setAcceleration(mediumAcceleration);
        car.setIgnition(jumpStart);
        car.accelerate();
        car.start();
    }
}
