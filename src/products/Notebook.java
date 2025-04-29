package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;

    private static int notebookCounter = 1;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        notebookCounter++;
    }
    
    @Override
    public String toString(){
        String coverType;
        if (isHardCover) {
            coverType = "Yes";
        }
        else {
            coverType = "No";
        }
        return super.toString() + ", Page Count: " + pageCount + ", Hard Cover: " + coverType;
    }
}