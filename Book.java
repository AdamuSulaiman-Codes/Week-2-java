public class Book {
    private String author;
    private int ISBN;
    private String title;

    public Book(String author, int iSBN, String title) {
        this.author = author;
        this.ISBN = iSBN;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Book [author=" + author + ", ISBN=" + ISBN + ", title=" + title + "]";
    }
    
}
