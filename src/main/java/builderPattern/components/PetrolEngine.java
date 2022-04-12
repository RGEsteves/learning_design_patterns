package builderPattern.components;

public class PetrolEngine extends Engine{
    @Override
    public String name() {
        return "PetrolEngine";
    }

    @Override
    public float price() {
        return 1500.0f;
    }
}
