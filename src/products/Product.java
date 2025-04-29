package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    public String getTitle{
        return title;
    }

    public String setTitle(String title){
        this.title = title;
    }

    public String getPrice{
        return price;
    }

    public String setPrice(String title){
        this.price = price;
    }

    public String getId() {
        return id;
    }

    protected abstract String generateId();

    @Override
    public String toString(){
        return "ID: " + id + ", Title: " + title + ", Price: " + price;
    }
}