import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import prototypePattern.Animal;
import prototypePattern.AnimalCache;
import prototypePattern.AnimalType;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrototypePatternTest {

    @BeforeEach
    void setUp(){
        AnimalCache.loadCache();
    }

    @Test
    @DisplayName("A bird from cache")
    void testBird(){
        Animal clonedBird = (Animal) AnimalCache.getAnimal("1");
        assertTrue(clonedBird.getType().equals(AnimalType.BIRD));
    }

    @Test
    @DisplayName("A dog from cache")
    void testDog(){
        Animal clonedBird = (Animal) AnimalCache.getAnimal("2");
        assertTrue(clonedBird.getType().equals(AnimalType.DOG));
    }

    @Test
    @DisplayName("A fish from cache")
    void testFish(){
        Animal clonedBird = (Animal) AnimalCache.getAnimal("3");
        assertTrue(clonedBird.getType().equals(AnimalType.FISH));
    }

}
