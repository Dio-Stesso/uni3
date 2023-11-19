package models;

import com.example.florist.models.Accessory;
import com.example.florist.models.Bouquet;
import com.example.florist.models.Color;
import com.example.florist.models.Flower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BouquetTest {
    private Bouquet bouquet;
    private Flower rose;
    private Accessory ribbon;

    @BeforeEach
    void setUp() {
        bouquet = new Bouquet();
        rose = new Flower("Rose", Color.RED, 7, 15.0, 10.0);
        ribbon = new Accessory("Ribbon", 2.0);
    }

    @Test
    void testAddFlower() {
        bouquet.addFlower(rose);
        assertEquals(1, bouquet.getFlowers().size());
    }

    @Test
    void testAddAccessory() {
        bouquet.addAccessory(ribbon);
        assertEquals(1, bouquet.getAccessories().size());
    }

    @Test
    void testCalculateTotalCost() {
        bouquet.addFlower(rose);
        bouquet.addAccessory(ribbon);
        assertEquals(12.0, bouquet.calculateTotalCost());
    }

    @Test
    void testSortFlowersByFreshness() {
        Flower lily = new Flower("Lily", Color.WHITE, 5, 10.0, 8.0);
        bouquet.addFlower(rose);
        bouquet.addFlower(lily);
        bouquet.sortFlowersByFreshness();
        assertEquals(lily, bouquet.getFlowers().get(0));
    }

    @Test
    void testFindFlowerByStemLength() {
        Flower tulip = new Flower("Tulip", Color.YELLOW, 6, 12.0, 9.0);
        bouquet.addFlower(rose);
        bouquet.addFlower(tulip);
        List<Flower> result = bouquet.findFlowerByStemLength(10.0, 13.0);
        assertTrue(result.contains(tulip) && !result.contains(rose));
    }
}