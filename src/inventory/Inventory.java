package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;
}
