package builderPattern;

import builderPattern.components.*;

public class CarBuilder {
    public Car buildElectricCar(Color color){
        Car car = new Car();
        car.addComponent(new ElectricEngine());
        car.addComponent(color.compareTo(Color.WHITE)!=1 ? new WhiteColor(): new BlackColor());
        return car;
    }

    public Car buildPetrolCar(Color color){
        Car car = new Car();
        car.addComponent(new PetrolEngine());
        car.addComponent(color.compareTo(Color.WHITE)!=1 ? new WhiteColor(): new BlackColor());
        return car;
    }
}
