package dev.emmanoel.algorithms;

public class LowestPrice {
    public static Product execute(final Product[] products) {
        return execute(products, 0, products.length);
    }

    public static Product execute(final Product[] products, int start, int end) {
        int lowest = start;
        for (int actual = start; actual < end; actual++) {
            if (products[actual].getPrice() < products[lowest].getPrice()) {
                lowest = actual;
            }
        }
        return products[lowest];
    }
}
