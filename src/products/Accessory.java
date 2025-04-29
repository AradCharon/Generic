package products;

public class Accessory extends Product{
    private String color;

    private static int accessoryCounter = 1;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
        accessoryCounter++;
    }

    
}
