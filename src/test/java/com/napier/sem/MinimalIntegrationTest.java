package com.napier.sem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple integration test class
 */
public class MinimalIntegrationTest {

    @Test
    void appInstanceIsNotNull() {
        // test method to check if the app object is not null
        App app = new App();
        assertNotNull(app, "App instance should not be null");
    }
}
