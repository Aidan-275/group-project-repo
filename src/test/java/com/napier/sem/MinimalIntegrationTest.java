package com.napier.sem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimalIntegrationTest {

    @Test
    void appInstanceIsNotNull() {
        App app = new App();
        assertNotNull(app, "App instance should not be null");
    }
}
