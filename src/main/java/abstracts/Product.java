package abstracts;

import interfaces.Sellable;

public abstract class Product implements Sellable {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String description() {
        return "Producto: " + name;
    }

    public int lowestPrice() {
        return price - 500;
    }

    public int listPrice() {
        return price;
    }
}
