import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import singletonPattern.SingleObject;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingletonPatternTest {
    SingleObject singleObject = SingleObject.getInstance();

    @Test
    @DisplayName("Expected a single instance of SingleObject")
    void testSingletonPattern(){
        // expected to have the same memory address in stack
        assertTrue(singleObject == SingleObject.getInstance());
    }
}
