package builderPattern.components;

import builderPattern.Component;

public abstract class Engine implements Component {

    @Override
    public Assembly assembling() {
        return new EngineBox();
    }

    @Override
    public abstract float price();
}
