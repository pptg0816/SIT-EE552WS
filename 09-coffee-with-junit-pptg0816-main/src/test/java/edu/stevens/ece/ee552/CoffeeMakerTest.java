
package edu.stevens.ece.ee552;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeMakerTest {
    // Write some tests here
    CoffeeMaker coffeeTest = new CoffeeMaker();
    @Test
    void testAddCoffee() {
        coffeeTest.addCoffee(2);
        assertEquals(2, coffeeTest.getScoopsCoffee());
    }

    @Test
    void testAddWater() {
        coffeeTest.addWater(3);
        assertEquals(3, coffeeTest.getCupsWater());
        System.out.println(coffeeTest.getCupsWater());
    }

    @Test
    void testTurnOn() {

    }

    @Test
    void testBrewCoffee() {
        coffeeTest.addWater(3);
        int previousWater = coffeeTest.getCupsWater();
        assertEquals(3, previousWater);
        coffeeTest.brewCoffee();
        assertEquals(previousWater, coffeeTest.getCupsCoffee());
        assertEquals(0, coffeeTest.getCupsWater());
    }

    @Test
    void testPour() {
        coffeeTest.addWater(3);
        coffeeTest.brewCoffee();
        coffeeTest.pour(1);
        assertEquals(2, coffeeTest.getCupsCoffee());

    }
}
