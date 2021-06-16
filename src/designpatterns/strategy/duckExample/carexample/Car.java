package designpatterns.strategy.duckExample.carexample;

import designpatterns.strategy.duckExample.carexample.acceleration.Acceleration;
import designpatterns.strategy.duckExample.carexample.door.Door;
import designpatterns.strategy.duckExample.carexample.ignition.Ignition;
import designpatterns.strategy.duckExample.carexample.transmission.Transmission;

public class Car {
    private Acceleration acceleration;
    private Transmission transmission;
    private Door door;
    private Ignition ignition;

    public Car(Acceleration acceleration, Transmission transmission, Door door, Ignition ignition) {
        this.acceleration = acceleration;
        this.transmission = transmission;
        this.door = door;
        this.ignition = ignition;
    }

    public void accelerate(){
        acceleration.accelerate();
    }
    public void shiftGears(){
        transmission.shiftGears();
    }
    public void openDoor(){
        door.open();
    }
    public void start(){
        ignition.start();
    }

    public void setAcceleration(Acceleration acceleration) {
        this.acceleration = acceleration;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setIgnition(Ignition ignition) {
        this.ignition = ignition;
    }
}
