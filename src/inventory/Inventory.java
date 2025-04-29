package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public ArrayList<T> getItem{
        return items;
    }

    public void setItems(ArrayList<T> items){
        this.items = items;
    }

    public void applyDiscount(String productName, int discount) {
        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(productName)) {
                double newPrice = item.getPrice() * (100 - discount) / 100;
                item.setPrice(newPrice);
            }
        }
    }

    public void addItem(T product){
        items.add(product);
    }
}
