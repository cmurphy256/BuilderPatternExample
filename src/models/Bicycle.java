package models;

public class Bicycle {

    private String color;
    private String brakeType;
    private boolean hasBell;

    public Bicycle(){

    }

    public Bicycle(String color, String brakes){
        this.color = color;
        this.brakeType = brakes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    public String toString(){

        StringBuilder bike = new StringBuilder();

        if(color != null){
            bike.append(this.color);
        }

        if(bike.length() > 0){
            bike.append(" bicycle ");
        }
        else{
            bike.append("Bicycle ");
        }

        if(this.brakeType != null){
            bike.append("with ");
            bike.append(this.brakeType);
            bike.append(" brakes");

            if(hasBell){
                bike.append(" and a bell ");
            }

        }
        else{
            if(hasBell){
                bike.append(" with a bell ");
            }
        }

        return bike.toString();
    }
}
