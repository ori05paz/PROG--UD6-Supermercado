public class Client {
    
    private String name;
    private int id;
    private Stack<Product> shoppingBasket;
    private static int counter = 0;
    
    public Client(String name, int id, Stack<Product> shoppingBasket) {
        this.name = name;
        this.id = id;
        this.shoppingBasket = shoppingBasket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stack<Product> getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket(Stack<Product> shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public void addProduct(Product product) {
        shoppingBasket.push(product);
    }

    public void removeProduct() {
        if (!shoppingBasket.isEmpty()) {
            shoppingBasket.pop();
        }
    }

    public void emptyShoppingBasket() {
        shoppingBasket.clear();
    }

    public static String generateNames() {
        String[] names = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Sofía", "David", "Elena"};
        return names[new Random().nextInt(names.length)];
    }
}
