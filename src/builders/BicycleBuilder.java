package builders;

import models.Bicycle;

public class BicycleBuilder {

    private String brakeType;
    private String color;
    private boolean hasBell;

    public BicycleBuilder setBrakeType(String brakeType) {
        this.brakeType = brakeType;
        return this;
    }

    public BicycleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public BicycleBuilder setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
        return this;
    }

    public Bicycle build(){
        Bicycle bike =  new Bicycle();
        bike.setBrakeType(brakeType);
        bike.setColor(color);
        bike.setHasBell(hasBell);
        return bike;
    }
}
