package com.example.lesson1.practice.transport;

/**
 * Created by troy379 on 23.09.16.
 */
public abstract class AbstractCar extends Transport {;

    private int passengersCount;
    private int wheelsCount;
    private FuelType fuel;

    public AbstractCar(int passengersCount, int wheelsCount, FuelType fuel) {
        this.passengersCount = passengersCount;
        this.wheelsCount = wheelsCount;
        this.fuel = fuel;
    }

    @Override
    public void prepare() {
        isPrepared = true;
    }

    @Override
    public void move(int kilometers) {
        if (!isPrepared) {
            throw new TransportException("Transport is not prepared.");
        }
    }

    @Override
    public void stop() {
        isPrepared = false;
    }

    // TODO: 23.09.16 logic for passengers

    public enum FuelType {
        DIESEL(0), GAS(1), ELECTRICITY(2), LPG(3);

        private int value;

        FuelType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static FuelType fromInt(int value) {
            switch (value) {
                case 0:
                    return DIESEL;
                case 1:
                    return GAS;
                case 2:
                    return ELECTRICITY;
                case 3:
                    return LPG;
                default:
                    return ELECTRICITY;
            }
        }
    }
}
