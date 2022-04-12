package factoryPattern;

public class Bird implements Animal{

    @Override
    public Move move() {
        return Move.FLY;
    }
}
