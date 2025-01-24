package gradle.leaning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appCanRunWithoutErrors() {
        App classUnderTest = new App();
        assertDoesNotThrow(() -> classUnderTest.main(new String[]{}), "App should run without throwing exceptions");
    }
}
