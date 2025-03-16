package abstracts;

import interfaces.Descuento;
import interfaces.Sellable;

public abstract class Product implements Sellable, Descuento {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String description() {
        return "Producto: " + name;
    }

    public int aplicarDescuento(){

        if(price>2500){
            return price-1000;
        }else
            return price-250;

    }
    public int lowestPrice() {
        return aplicarDescuento()-500;
    }

    public int listPrice() {
        return price;
    }

}
