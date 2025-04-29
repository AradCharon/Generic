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
        bookCounter++;
    }

    @Override
    protected abstract String generateId(){
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
        return "1" + result;
    }

    @Override
    public String toString(){
        return super.toString() + ", Author: " + author + ", Publication: " + publication + ", Genre: " + genre;
    }

}
