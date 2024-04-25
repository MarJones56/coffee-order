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
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(3.59F, receipt.getPrice());
        assertEquals("Dark roast, Milk, Milk, Milk, Milk", receipt.getDescription());
    }

    @Test
    void DarkRoast_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.51F, receipt.getPrice());
        assertEquals("Dark roast, Soy, Whip", receipt.getDescription());
    }

    @Test
    void DarkRoast_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(3.21F, receipt.getPrice());
        assertEquals("Dark roast, Milk, Mocha, Whip, Soy", receipt.getDescription());
    }

    @Test
    void DarkRoast_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("dark roast", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.86F, receipt.getPrice());
        assertEquals("Dark roast, Mocha, Soy, Mocha", receipt.getDescription());
    }

    @Test
    void Espresso_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.94F, receipt.getPrice());
        assertEquals("Espresso, Milk, Milk, Milk, Milk", receipt.getDescription());
    }

    @Test
    void Espresso_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(1.86F, receipt.getPrice());
        assertEquals("Espresso, Soy, Whip", receipt.getDescription());
    }

    @Test
    void Espresso_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.56F, receipt.getPrice());
        assertEquals("Espresso, Milk, Mocha, Whip, Soy", receipt.getDescription());
    }

    @Test
    void Espresso_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("espresso", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.21F, receipt.getPrice());
        assertEquals("Espresso, Mocha, Soy, Mocha", receipt.getDescription());
    }

    @Test
    void HouseBlend_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(3.25F, receipt.getPrice());
        assertEquals("House Blend, Milk, Milk, Milk, Milk", receipt.getDescription());
    }

    @Test
    void HouseBlend_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.17F, receipt.getPrice());
        assertEquals("House Blend, Soy, Whip", receipt.getDescription());
    }

    @Test
    void HouseBlend_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.87F, receipt.getPrice());
        assertEquals("House Blend, Milk, Mocha, Whip, Soy", receipt.getDescription());
    }

    @Test
    void HouseBlend_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("house blend", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.52F, receipt.getPrice());
        assertEquals("House Blend, Mocha, Soy, Mocha", receipt.getDescription());
    }

    @Test
    void Decaf_Test1() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "milk", "milk", "milk"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.88F, receipt.getPrice());
        assertEquals("Decaf, Milk, Milk, Milk, Milk", receipt.getDescription());
    }

    @Test
    void Decaf_Test2() throws Exception {
        List<String> condiments = (Arrays.asList("soy", "whip"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(1.80F, receipt.getPrice());
        assertEquals("Decaf, Soy, Whip", receipt.getDescription());
    }

    @Test
    void Decaf_Test3() throws Exception {
        List<String> condiments = (Arrays.asList("milk", "mocha", "whip", "soy"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.50F, receipt.getPrice());
        assertEquals("Decaf, Milk, Mocha, Whip, Soy", receipt.getDescription());
    }

    @Test
    void Decaf_Test4() throws Exception {
        List<String> condiments = (Arrays.asList("mocha", "soy", "mocha"));
        OrderData order = new OrderData("decaf", condiments);
        Receipt receipt = OrderFileRepository.add(order);
        assertEquals(2.15F, receipt.getPrice());
        assertEquals("Decaf, Mocha, Soy, Mocha", receipt.getDescription());
    }

}