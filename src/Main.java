import products.Product;
import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;

public class Main {
    public static void main(String[] args) {
        public static double calculateTotalPrice (Inventory<? extends Product> inventory){
            double total = 0;
            for (Product item : inventory.getItems()){
                total += item.getPrice;
            }

            return total;
        }
    }
}