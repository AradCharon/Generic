import products.Product;
import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventoryInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItem(new Book("Critique of Pure Reason" , 45.99," Immanuel Kant", "Khaarazmi", "Epistemology"));
        bookInventory.addItem(new Book("Animal Farm" , 25.99," George Orwell", "Cheshmeh", "Social policy"));

        notebookInventory.addItem(new Notebook("A4 Notebook", 12.50, 120, false));
        notebookInventory.addItem(new Notebook("Premium Notebook", 24.99, 200, true));

        accessoryInventory.addItem(new Accessory("Book Mark Pack", 5.99, "Black"));
        accessoryInventory.addItem(new Accessory("Pen", 1.99, "Blue"));

        System.out.println("=== All Books ===");
        bookInventory.displayAll();
        System.out.println("\n=== All Notebooks ===");
        notebookInventory.displayAll();
        System.out.println("\n=== All Accessories ===");
        accessoryInventory.displayAll();

        System.out.println("\n=== Total Prices ===");
        System.out.println("Total BookPrices: " + calculateTotalPrice(bookInventory));
        System.out.println("Total Notebooks Price: " + calculateTotalPrice(notebookInventory));
        System.out.println("Total Accessories Price: " + calculateTotalPrice(accessoryInventory));

        bookInventory.removeItemById("1001");
        notebookInventory.removeItemById("3002");

        System.out.println("\n=== Finding Items ===");
        System.out.println("Found: " + bookInventory.findItemById("1002"));
        System.out.println("Not Found: " + bookInventory.findItemById("9999"));

        bookInventory.applyDiscount("Animal Farm", 10);
        accessoryInventory.applyDiscount("Pen", 20);

        public static double calculateTotalPrice (Inventory<? extends Product> inventory){
            double total = 0;
            for (Product item : inventory.getItems()){
                total += item.getPrice;
            }

            return total;
        }
    }
}