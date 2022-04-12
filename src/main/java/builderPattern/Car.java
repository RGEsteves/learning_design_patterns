package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Component> componentsList = new ArrayList<Component>();

    public void addComponent(Component component){
        componentsList.add(component);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Component component : componentsList) {
            cost += component.price();
        }
        return cost;
    }

    public List<Component> getComponents(){
        return componentsList;
    }
}
