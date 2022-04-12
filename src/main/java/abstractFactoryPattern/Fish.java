package abstractFactoryPattern;

public class Fish implements Animal {

    @Override
    public Move move() {
        return Move.SWIM;
    }
}
