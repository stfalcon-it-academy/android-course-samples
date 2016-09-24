package com.example.lesson1.practice.transport;

/**
 * Created by troy379 on 23.09.16.
 */
public class ElectroCar extends AbstractCar {

    public ElectroCar(int passengersCount, int wheelsCount) {
        super(passengersCount, wheelsCount, FuelType.ELECTRICITY);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("is prepared: " + isPrepared);
    }

    @Override
    public void move(int kilometers) {
        super.move(kilometers);
        System.out.println("move for " + kilometers + " km");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("stopped");
        notifyTransportStopped();
    }

    @Override
    public void makeSound() {
        System.out.println("beep-beep");
    }
}
