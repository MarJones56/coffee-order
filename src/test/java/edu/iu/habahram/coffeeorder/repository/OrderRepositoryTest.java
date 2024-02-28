package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    @BeforeAll
    static void setup() throws IOException {
        Files.deleteIfExists(Paths.get("db.txt"));
    }

    @AfterAll
    static void cleanup() throws IOException {
        Files.delete(Paths.get("db.txt"));
    }

    @Test
    void DarkRoast_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(3.59F, receipt.cost());
        assertEquals("Dark roast, Milk, Milk, Milk, Milk", receipt.description());
    }

    @Test
    void DarkRoast_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.51F, receipt.cost());
        assertEquals("Dark roast, Soy, Whip", receipt.description());
    }

    @Test
    void DarkRoast_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(3.21F, receipt.cost());
        assertEquals("Dark roast, Milk, Mocha, Whip, Soy", receipt.description());
    }

    @Test
    void DarkRoast_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.86F, receipt.cost());
        assertEquals("Dark roast, Mocha, Soy, Mocha", receipt.description());
    }

    @Test
    void Espresso_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.94F, receipt.cost());
        assertEquals("Espresso, Milk, Milk, Milk, Milk", receipt.description());
    }

    @Test
    void Espresso_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(1.86F, receipt.cost());
        assertEquals("Espresso, Soy, Whip", receipt.description());
    }

    @Test
    void Espresso_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.56F, receipt.cost());
        assertEquals("Espresso, Milk, Mocha, Whip, Soy", receipt.description());
    }

    @Test
    void Espresso_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.21F, receipt.cost());
        assertEquals("Espresso, Mocha, Soy, Mocha", receipt.description());
    }

    @Test
    void HouseBlend_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(3.25F, receipt.cost());
        assertEquals("House Blend, Milk, Milk, Milk, Milk", receipt.description());
    }

    @Test
    void HouseBlend_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.17F, receipt.cost());
        assertEquals("House Blend, Soy, Whip", receipt.description());
    }

    @Test
    void HouseBlend_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.87F, receipt.cost());
        assertEquals("House Blend, Milk, Mocha, Whip, Soy", receipt.description());
    }

    @Test
    void HouseBlend_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.52F, receipt.cost());
        assertEquals("House Blend, Mocha, Soy, Mocha", receipt.description());
    }

    @Test
    void Decaf_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.88F, receipt.cost());
        assertEquals("Decaf, Milk, Milk, Milk, Milk", receipt.description());
    }

    @Test
    void Decaf_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(1.80F, receipt.cost());
        assertEquals("Decaf, Soy, Whip", receipt.description());
    }

    @Test
    void Decaf_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.50F, receipt.cost());
        assertEquals("Decaf, Milk, Mocha, Whip, Soy", receipt.description());
    }

    @Test
    void Decaf_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderRepository.add(order);
        assertEquals(2.15F, receipt.cost());
        assertEquals("Decaf, Mocha, Soy, Mocha", receipt.description());
    }

}