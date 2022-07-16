package dev.emmanoel.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmsTest {

    @Test
    void lowestPrice() {
        final Product[] products = {
            new Product("Lamborghini", 100000),
            new Product("Jipe", 46000),
            new Product("Brasília", 17000),
            new Product("Smart", 46000),
            new Product("Fusca", 17000)
        };

        final Product expected = products[2];
        final Product actual = LowestPrice.execute(products);

        assertEquals(expected, actual);
    }
}
