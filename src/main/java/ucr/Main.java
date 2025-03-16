package ucr;


public class Main {
    public static void main(String[] args) {
        Book book = new Book("Padre Rico, Padre Pobre", 5000, "Robert Kiyosaki");
        System.out.println(book.description());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Precio: " + book.listPrice());
        System.out.println("Precio mínimo: " + book.lowestPrice());
    }
}