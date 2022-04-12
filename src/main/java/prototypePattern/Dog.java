package prototypePattern;

import prototypePattern.Animal;

public class Dog extends Animal {

    public Dog() {
        type = AnimalType.DOG;
    }

    @Override
    public Move move() {
        return Move.RUN;
    }
}
