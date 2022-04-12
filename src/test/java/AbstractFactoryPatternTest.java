import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.AnimalType;
import abstractFactoryPattern.FactoryProducer;
import abstractFactoryPattern.Animal;
import abstractFactoryPattern.Move;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryPatternTest {
    AbstractFactory animalFactory;
    AbstractFactory animalInRecoveryFactory;
    @BeforeEach
    void setUp(){
        animalFactory = FactoryProducer.getFactory(false);
        animalInRecoveryFactory = FactoryProducer.getFactory(true);
    }

    @Test
    @DisplayName("A bird should fly. But if in recovery should rest.")
    void testBird(){
        Animal bird = animalFactory.getAnimal(AnimalType.BIRD);
        assertEquals(Move.FLY, bird.move());
        Animal birdInRecovery = animalInRecoveryFactory.getAnimal(AnimalType.BIRD);
        assertEquals(Move.REST, birdInRecovery.move());
    }

    @Test
    @DisplayName("A dog should run. But if in recovery should rest.")
    void testDog(){
        Animal dog = animalFactory.getAnimal(AnimalType.DOG);
        assertEquals(Move.RUN, dog.move());
        Animal dogInRecovery = animalInRecoveryFactory.getAnimal(AnimalType.DOG);
        assertEquals(Move.REST, dogInRecovery.move());
    }

    @Test
    @DisplayName("A fish should swim. But if in recovery should rest.")
    void testFish(){
        Animal fish = animalFactory.getAnimal(AnimalType.FISH);
        assertEquals(Move.SWIM, fish.move());
        Animal fishInRecovery = animalInRecoveryFactory.getAnimal(AnimalType.FISH);
        assertEquals(Move.REST, fishInRecovery.move());
    }
}
