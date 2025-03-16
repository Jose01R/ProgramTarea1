package ucr;


import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Padre Rico, Padre Pobre", 5000, "Robert Kiyosaki");
        System.out.println(book.description());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Precio: " + book.listPrice());

        if (book.listPrice() > 2500) {
            System.out.println("Se le aplicó un descuento de 1000, nuevo precio: " + book.aplicarDescuento());
        } else{
            System.out.println("Se le aplicó un descuento de 250, nuevo precio:: " + book.aplicarDescuento());
    }
        System.out.println("Precio mínimo: " + book.lowestPrice());
    }


}