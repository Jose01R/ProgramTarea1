package abstracts;

import interfaces.Descuento;
import interfaces.Sellable;
                                //MULTIPLE INTERFACES ("Mixin")
public abstract class Product implements Sellable, Descuento {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //ABSTRACT METHOD
    public abstract String description();

    @Override
    public int aplicarDescuento(){

        if(price>2500){
            return price-1000;
        }else
            return price-250;
    }

    @Override
    public int lowestPrice() {
        return aplicarDescuento() - 500;
    }

    @Override
    public int listPrice() {
        return price;
    }

}
