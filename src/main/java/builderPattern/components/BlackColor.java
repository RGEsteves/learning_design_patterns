package builderPattern.components;

public class BlackColor extends CarColor {
    @Override
    public String name() {
        return "BlackColor";
    }

    @Override
    public float price() {
        return 250.0f;
    }
}
