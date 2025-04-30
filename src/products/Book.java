package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    private static int bookCounter = 1;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    @Override
    protected String generateId() {
        String result;
        if (bookCounter < 10) {
            result = "00" + bookCounter;
        }
        else if (bookCounter < 100) {
            result = "0" + bookCounter;
        }
        else {
            result = "" + bookCounter;
        }
        bookCounter++;
        return "1" + result;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Author: " + author +
                ", Publication: " + publication +
                ", Genre: " + genre;
    }
}