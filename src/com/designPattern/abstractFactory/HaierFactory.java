package com.designPattern.abstractFactory;

public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produecAirConditioner() {
        return new HaierAirConditioner();
    }
}
