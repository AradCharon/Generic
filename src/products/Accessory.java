package products;

public class Accessory extends Product{
    private String color;

    private static int accessoryCounter = 1;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
        accessoryCounter++;
    }

    protected abstract String generateId(){
        String result;
        if (accessoryCounter < 10) {
            result = "00" + accessoryCounter;
        }
        else if (accessoryCounter < 100) {
            result = "0" + accessoryCounter;
        }
        else {
            result = "" + accessoryCounter;
        }
        return "3" + result;

        public String getColor() {
            return color;
        }

        public void getColor(String getColor) {
            this.color = color;
        }

        @Override
        public String toString() {
            return super.toString() + ", Color: " + color;
        }
    }

}
