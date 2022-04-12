package builderPattern;

import builderPattern.components.Assembly;

public interface Component {
    public String name();
    public Assembly assembling();
    public float price();
}
