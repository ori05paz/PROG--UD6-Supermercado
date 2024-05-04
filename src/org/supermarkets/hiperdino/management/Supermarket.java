package org.supermarkets.hiperdino.management;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

import org.supermarkets.hiperdino.elements.Cashier;
import org.supermarkets.hiperdino.elements.Client;
import org.supermarkets.hiperdino.elements.Product;

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


    public Supermarket(Cashier cashier) {
        this.cashier = new Cashier(1);
        this.clientQueue = new LinkedList<>();
    }

    public void openBox() {
        cashier.openBox();
    }

    public void addNewClient() {
        if (cashier.isOpenedBox()) {
            Client newClients = generateClients();
            clientQueue.add(newClients);
            System.out.println("Nuevo cliente añadido a la cola: " + newClients.getName());
        } else {
            System.out.println("La caja está cerrada. No se puede agregar un nuevo cliente a la cola.");
        }
    }

    public void serveClient() {
        if (!clientQueue.isEmpty()) {
            Client nowClient = clientQueue.poll();
            System.out.println("Atendiendo al cliente: " + nowClient.getName());
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    public void pendingClients() {
        if (!clientQueue.isEmpty()) {
            System.out.println("Clientes pendientes en la cola:");
            for (Client client : clientQueue) {
                System.out.println("- " + client.getName());
            }
        } else {
            System.out.println("No hay clientes pendientes en la cola.");
        }
    }

    public void closeSupermarket() {
        cashier.closeBox();
    }

    private Client generateClients() {
        String randomName = Client.generateNames();
        Client client = new Client(randomName);
        int numProducts = new Random().nextInt(12) + 1;
        Stack<Product> shoppingBasket = new Stack<>();
        for (int i = 0; i < numProducts; i++) {
            Product randomProduct = availableProducts[new Random().nextInt(availableProducts.length)];
            shoppingBasket.push(randomProduct);
        }
        client.setShoppingBasket(shoppingBasket);
        return client;
    }
}
