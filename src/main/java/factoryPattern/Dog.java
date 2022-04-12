package factoryPattern;

public class Dog implements Animal{

    @Override
    public Move move() {
        return Move.RUN;
    }
}
