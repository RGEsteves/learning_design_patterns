package abstractFactoryPattern;

public class FishInRecovery implements Animal {

    @Override
    public Move move() {
        return Move.REST;
    }
}
