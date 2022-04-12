package abstractFactoryPattern;

public class BirdInRecovery implements Animal {

    @Override
    public Move move() {
        return Move.REST;
    }
}
