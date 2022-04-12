import builderPattern.Car;
import builderPattern.CarBuilder;
import builderPattern.Component;
import builderPattern.components.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderPatternTest {
    CarBuilder carBuilder = new CarBuilder();

    @Test
    @DisplayName("White Electric Car that costs 3200")
    void testWhiteElectricCar(){
        // Expected Results
        String[] expectedComponentsName = {"ElectricEngine", "WhiteColor"};
        float expectedCost = 3200.0f;
        // Get results
        Car electricCar = carBuilder.buildElectricCar(Color.WHITE);
        List<Component> componentList = electricCar.getComponents();
        float cost = electricCar.getCost();
        // Assertions
        for (int i = 0; i < componentList.size(); i++) {
            assertTrue(componentList.get(i).name().equalsIgnoreCase(expectedComponentsName[i]));
        }
        assertTrue(cost == expectedCost);
    }

    @Test
    @DisplayName("Black Electric Car that costs 3250")
    void testBlackElectricCar(){
        // Expected Results
        String[] expectedComponentsName = {"ElectricEngine", "BlackColor"};
        float expectedCost = 3250.0f;
        // Get results
        Car electricCar = carBuilder.buildElectricCar(Color.BLACK);
        List<Component> componentList = electricCar.getComponents();
        float cost = electricCar.getCost();
        // Assertions
        for (int i = 0; i < componentList.size(); i++) {
            assertTrue(componentList.get(i).name().equalsIgnoreCase(expectedComponentsName[i]));
        }
        assertTrue(cost == expectedCost);
    }

    @Test
    @DisplayName("White Petrol Car that costs 1700")
    void testWhitePetrolCar(){
        // Expected Results
        String[] expectedComponentsName = {"PetrolEngine", "WhiteColor"};
        float expectedCost = 1700.0f;
        // Get results
        Car petrolCar = carBuilder.buildPetrolCar(Color.WHITE);
        List<Component> componentList = petrolCar.getComponents();
        float cost = petrolCar.getCost();
        // Assertions
        for (int i = 0; i < componentList.size(); i++) {
            assertTrue(componentList.get(i).name().equalsIgnoreCase(expectedComponentsName[i]));
        }
        assertTrue(cost == expectedCost);
    }

    @Test
    @DisplayName("Black Electric Car that costs 1750")
    void testBlackPetrolCar(){
        // Expected Results
        String[] expectedComponentsName = {"PetrolEngine", "BlackColor"};
        float expectedCost = 1750.0f;
        // Get results
        Car petrolCar = carBuilder.buildPetrolCar(Color.BLACK);
        List<Component> componentList = petrolCar.getComponents();
        float cost = petrolCar.getCost();
        // Assertions
        for (int i = 0; i < componentList.size(); i++) {
            assertTrue(componentList.get(i).name().equalsIgnoreCase(expectedComponentsName[i]));
        }
        assertTrue(cost == expectedCost);
    }
}
