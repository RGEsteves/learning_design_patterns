package builderPattern.components;

public class ElectricEngine extends Engine{
    @Override
    public String name() {
        return "ElectricEngine";
    }

    @Override
    public float price() {
        return 3000.0f;
    }
}
