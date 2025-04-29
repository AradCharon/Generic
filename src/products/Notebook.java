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

    protected abstract String generateId(){
        String result;
        if (notebookCounter < 10) {
            result = "00" + notebookCounter;
        }
        else if (notebookCounter < 100) {
            result = "0" + notebookCounter;
        }
        else {
            result = "" + notebookCounter;
        }
        return "2" + result;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
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