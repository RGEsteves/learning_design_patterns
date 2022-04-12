package builderPattern.components;

import builderPattern.Component;

public abstract class CarColor implements Component {

    @Override
    public Assembly assembling() {
        return new CarExterior();
    }

    @Override
    public abstract float price();
}
