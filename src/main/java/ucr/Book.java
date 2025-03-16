package ucr;

import abstracts.Product;

public class Book extends Product {
    private String author;

    public Book(String name, String author, int price) {
        super(name, price);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author; //no se esta usando
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String description() {
        return "\nLibro: " + name + "\nAutor: " + author + "\nPrecio: " + price + "\n";
    }
}
