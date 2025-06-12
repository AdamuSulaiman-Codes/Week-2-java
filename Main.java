public class Main{
    public static void main(String[] args) {
        BookCollection books = new BookCollection();

        books.addBook("Achlys", 400, "I am Atomic");
        books.addBook("Trybe Zone", 450, "The Rice Bowl");
        books.addBook("Achlys", 460, "Life is a Game");

        books.displayBooks();

        books.removeBook(450);
        System.out.println("----------");

        books.displayBooks();
    }
}