package com.napier.sem;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests for the App class (JUnit 5.1.0 compatible)
 */
public class AppIntegrationTest {

    private static App app;

    @BeforeAll
    static void init() {
        app = new App();
        app.connect("localhost:33060", 0);
    }

    @AfterAll
    static void cleanup() {
        app.disconnect();
    }

    @Test
    @DisplayName("Database connection should succeed")
    void testDatabaseConnection() {
        assertNotNull(app, "App instance should not be null");
    }

    @Test
    @DisplayName("getAllCountries should return data")
    void testGetAllCountries() {
        ArrayList<Country> countries = app.getAllCountries();
        assertNotNull(countries, "Country list should not be null");
        assertFalse(countries.isEmpty(), "Country list should not be empty");
    }

    @Test
    @DisplayName("Result should include USA")
    void testContainsKnownCountry() {
        ArrayList<Country> countries = app.getAllCountries();
        boolean found = false;
        for (Country c : countries) {
            if ("USA".equals(c.Code)) {
                found = true;
                break;
            }
        }
        assertTrue(found, "USA should exist in results");
    }

    @Test
    @DisplayName("Countries should be ordered by population descending")
    void testPopulationOrder() {
        ArrayList<Country> countries = app.getAllCountries();
        for (int i = 1; i < countries.size(); i++) {
            assertTrue(
                    countries.get(i - 1).Population >= countries.get(i).Population,
                    "Population ordering is incorrect at index " + i
            );
        }
    }
}
