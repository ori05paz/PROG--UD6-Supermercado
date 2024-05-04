package org.supermarkets.hiperdino.management;

public class Supermarket {
    
    private Cashier cashier;
    private Queue<Client> clientQueue;
    private static final Product[] availableProducts = {
        new Product("Leche", 1.5),
        new Product("Pan", 0.8),
        new Product("Huevos", 2.0),
        new Product("Arroz", 1.2),
        new Product("Pasta", 0.9),
        new Product("Aceite", 3.0),
        new Product("Café", 4.5),
        new Product("Azúcar", 1.0),
        new Product("Sal", 0.5),
        new Product("Galletas", 1.2),
        new Product("Refresco", 1.0),
        new Product("Chocolate", 2.5)
    };
}
