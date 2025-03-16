package ucr;

import abstracts.Product;

public class Book extends Product {
    private String author;

    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author; //no se esta usando
    }

    public String getAuthor() {
        return author;
    }
}
