package prototypePattern;

import prototypePattern.Animal;

public class Bird extends Animal {

    public Bird() {
        type = AnimalType.BIRD;
    }

    @Override
    public Move move() {
        return Move.FLY;
    }
}
