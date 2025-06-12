import java.util.ArrayList;

public class BookCollection {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void displayBooks(){
        for(Book book: books){
            System.out.println(book.getTitle() + " : " + " by " + book.getAuthor() + ":" + book.getISBN()  + ":");
        }
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String author, int ISBN, String title){

        Book book = new Book(author, ISBN, title);
        books.add(book);
    }

    public void removeBook(int ISBN){
        for(Book book: books){
            if(book.getISBN() == ISBN){
                books.remove(book);
            }
        }
    }

    public void updateBook(int ISBN, String updatedAuthor, String updatedTitle){
        for(Book book: books){
            if(book.getISBN() == ISBN){
                book.setTitle(updatedTitle);
                book.setAuthor(updatedAuthor);
                book.setISBN(ISBN);
            }
        }
    }
}
