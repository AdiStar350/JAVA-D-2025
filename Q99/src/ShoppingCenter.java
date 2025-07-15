
public class ShoppingCenter {

    private String name = "New Mall";
    private Business[] busArr = new Business[120];
    private int freeArea = 0;
    private int current = 0;

    public ShoppingCenter() {
    }

    public ShoppingCenter(String name, int totalArea) {
        this.name = name;
        this.freeArea = totalArea;
    }

    public ShoppingCenter(String name, Business[] busArr, int freeArea, int current) {
        this(name, freeArea);
        this.busArr = busArr;
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Business[] getBusArr() {
        return busArr;
    }

    public void setBusArr(Business[] busArr) {
        this.busArr = busArr;
    }

    public int getFreeArea() {
        return freeArea;
    }

    public void setFreeArea(int freeArea) {
        this.freeArea = freeArea;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "ShoppingCenter{"
                + "name='" + name + '\''
                + ", busArr=" + java.util.Arrays.toString(busArr)
                + ", freeArea=" + freeArea
                + ", current=" + current
                + '}';
    }

    public boolean addBusiness(String name, String type, int area, String owner) {
        if (this.freeArea >= area && this.current < 120) {
            busArr[this.current] = new Business(name, type, area, owner);
            this.current++;
            this.freeArea -= area;
            return true;
        }

        return false;
    }

    public void printRent(String[] owners) {
        for (String owner : owners) {
            float sum = 0f;

            for (Business bus : this.busArr) {
                if (bus.getOwner().equalsIgnoreCase(owner)) {
                    sum += bus.calculateRent();
                }
            }

            System.out.printf("%s's total rent is: %.2f\n", owner, sum);
        }
    }
}
