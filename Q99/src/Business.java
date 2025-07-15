
public class Business {

    private String name = "A New Business";
    private String type = "General";
    private int area = 0;
    private String owner = "No Owner";

    public Business() {
    }

    public Business(String name, String type, int area, String owner) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getArea() {
        return area;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Business{"
                + "name='" + name + '\''
                + ", type='" + type + '\''
                + ", area=" + area
                + ", owner='" + owner + '\''
                + '}';
    }

    public double calculateRent() {
        return switch (type.toLowerCase()) {
            case "restaurant" ->
                area * 150.0;
            case "coffee shop" ->
                area * 120.0;
            case "food" ->
                area * 100.0;
            default ->
                area * 80.0;
        };
    }
}
