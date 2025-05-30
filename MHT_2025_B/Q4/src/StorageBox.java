import java.util.Random;

public class StorageBox {
    private String color;
    private int length;
    private int width;
    private int height;
    private double cost;
    private boolean hasCover;
    private Random rnd = new Random();

    

    public StorageBox(String color, double cost, boolean hasCover, int height, int length, int width) {
        this.color = color;
        this.cost = cost;
        this.hasCover = hasCover;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public StorageBox(double cost) {
        this.color = "white";
        this.hasCover = false;
        this.width = rnd.nextInt(71) + 30;
        this.height = rnd.nextInt(71) + 30;
        this.length = rnd.nextInt(71) + 30;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isHasCover() {
        return hasCover;
    }

    public void setHasCover(boolean hasCover) {
        this.hasCover = hasCover;
    }

    @Override
    public String toString() {
        return "StorageBox{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", cost=" + cost +
                ", hasCover=" + hasCover +
                '}';
    }

    
    
}