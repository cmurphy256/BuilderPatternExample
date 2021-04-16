import builders.BicycleBuilder;
import models.Bicycle;

public class Main {

    public static void main(String[] args) {
        Bicycle bike = new Bicycle("red", "disc");
        System.out.println(bike);

        Bicycle bike1 = new BicycleBuilder().setBrakeType("disc").setHasBell(true).build();
        System.out.println(bike1);

        Bicycle bike2 = new BicycleBuilder().setBrakeType("disc").setColor("red").setHasBell(true).build();
        System.out.println(bike2);

        Bicycle bike3 = new BicycleBuilder().setColor("red").build();
        System.out.println(bike3);
    }
}