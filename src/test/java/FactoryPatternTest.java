import factoryPattern.Animal;
import factoryPattern.AnimalFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import factoryPattern.AnimalType;
import factoryPattern.Move;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactoryPatternTest {
    AnimalFactory animalFactory;
    @BeforeEach
    void setUp(){
        animalFactory = new AnimalFactory();
    }

    @Test
    @DisplayName("A bird should fly")
    void testBird(){
        Animal bird = animalFactory.getAnimal(AnimalType.BIRD);
        assertEquals(Move.FLY, bird.move());
    }

    @Test
    @DisplayName("A dog should run")
    void testDog(){
        Animal dog = animalFactory.getAnimal(AnimalType.DOG);
        assertEquals(Move.RUN, dog.move());
    }

    @Test
    @DisplayName("A fish should swim")
    void testFish(){
        Animal fish = animalFactory.getAnimal(AnimalType.FISH);
        assertEquals(Move.SWIM, fish.move());
    }
}
