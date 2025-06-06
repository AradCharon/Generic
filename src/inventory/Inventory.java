package inventory;

import products.Product;
import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items){
        this.items = items;
    }

    public void applyDiscount(String itemId, double discountPercent) {
        for (T item : items) {
            if (item.getId().equals(itemId)) {
                double newPrice = item.getPrice() * (1 - discountPercent/100);
                item.setPrice(newPrice);
                break;
            }
        }
    }

    public void addItem(T product){
        items.add(product);
    }

    public void removeItemById(String id) {
        List<T> itemsToRemove = new ArrayList<>();

        for (T item : items) {
            if (item.getId().equals(id)) {
                itemsToRemove.add(item);
            }
        }
        items.removeAll(itemsToRemove);
    }

    public T findItemsById(int id){
        for (T item : items) {
            if (item.getId().equals(id)){
                return item;
            }
        }

        System.out.println("Error: Product with ID " + id + " not found!");
        return null;
    }

    public void displayAll(){
        for (T item : items) {
            System.out.println(item);
        }
    }
}
