package abstractFactoryPattern;

public class DogInRecovery implements Animal {

    @Override
    public Move move() {
        return Move.REST;
    }
}
