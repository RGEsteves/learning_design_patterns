import bridgePattern.Animal;
import bridgePattern.Bird;
import bridgePattern.Chicken;
import bridgePattern.Pigeon;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgePatternTest {

    @Test
    @DisplayName("Chicken")
    void testChicken(){
        Animal chicken = new Bird(100, new Chicken());
        assertEquals("Moving Bird[bird: chicken, locomotion: walk, distance: 100 km]",chicken.move());
    }

    @Test
    @DisplayName("Pigeon")
    void testPigeon(){
        Animal pigeon = new Bird(100, new Pigeon());
        assertEquals("Moving Bird[bird: pigeon, locomotion: fly, distance: 100 km]",pigeon.move());
    }
}
