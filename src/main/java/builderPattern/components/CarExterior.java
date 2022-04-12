package builderPattern.components;

public class CarExterior implements Assembly{
    @Override
    public String assemble() {
        return "Paint car body";
    }
}
