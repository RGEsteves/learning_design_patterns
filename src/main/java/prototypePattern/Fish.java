package prototypePattern;

import prototypePattern.Animal;

public class Fish extends Animal {

    public Fish() {
        type = AnimalType.FISH;
    }

    @Override
    public Move move() {
        return Move.SWIM;
    }
}
