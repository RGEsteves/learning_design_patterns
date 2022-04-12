package builderPattern.components;

public class WhiteColor extends CarColor {
    @Override
    public String name() {
        return "WhiteColor";
    }

    @Override
    public float price() {
        return 200.0f;
    }
}
