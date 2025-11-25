package com.napier.sem;

import java.sql.*;
import java.util.*;

/**
 * The main class app where we have our methods
 * connect/disconnect from database as well as methods that will be used for testing
 */
public class App
{
    /**
     * Main method that creates a new app object and calls other methods
     */
    public static void main(String[] args) {
        // Create new Application and connect to database
        App a = new App();

        if(args.length < 1){
            a.connect("localhost:33060", 30000);
        }else{
            a.connect(args[0], Integer.parseInt(args[1]));
        }
//
        // Extract employee salary information
        ArrayList<Country> countries = a.getAllCountries();

        // Test the size of the returned data - should be 240124
        System.out.println(countries.size());

        a.printCountries(countries);

        // Disconnect from database
        a.disconnect();
    }

//x
    /**
     * Connection to database
     */
    private Connection con = null;

    /**
     * Connect to the database
     */
    public void connect(String location, int delay) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location
                                + "/world?allowPublicKeyRetrieval=true&useSSL=false",
                        "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " +                                  Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Method to disconnect from the database
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
    /**
     * Gets all the current employees and salaries.
     * @return A list of all employees and salaries, or null if there is an error.
     */
    public ArrayList<Country> getAllCountries()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital\n" +
                    "From country \n" +
                    "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country co = new Country();
                co.Code = rset.getString("Code");
                co.Name = rset.getString("Name");
                co.Continent = rset.getString("Continent");
                co.Region = rset.getString("Region");
                co.Population = rset.getInt("Population");
                co.Capital = rset.getString("Capital");

                countries.add(co);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints the countries of a given arraylist of country objects
     */
    public void printCountries(ArrayList<Country> countries)
    {
        // Print header
        System.out.printf("%-5s %-30s %-15s %-20s %-12s %-10s%n",
                "Code", "Name", "Continent", "Region", "Population", "Capital");

        // Loop over all countries in the list
        for (Country co : countries)
        {
            System.out.printf("%-5s %-30s %-15s %-20s %-12d %-10s%n",
                    co.Code, co.Name, co.Continent, co.Region, co.Population, co.Capital);
        }
    }
}