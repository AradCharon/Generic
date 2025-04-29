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
}
