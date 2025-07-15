
/**
 * Represents a food item with attributes such as name, price, milk content,
 * and rating.
 */
public class Food {

    private String name;
    private double price;
    private boolean isMilk;
    private int rating;

    /**
     * Constructs a Food object with the specified attributes.
     *
     * @param isMilk Indicates whether the food contains milk.
     * @param name The name of the food.
     * @param price The price of the food.
     * @param rating The rating of the food.
     */
    public Food(boolean isMilk, String name, double price, int rating) {
        this.isMilk = isMilk;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    /**
     * Gets the name of the food.
     *
     * @return The name of the food.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the food.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the price of the food.
     *
     * @return The price of the food.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the food.
     *
     * @param price The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets whether the food contains milk.
     *
     * @return True if the food contains milk, false otherwise.
     */
    public boolean getIsMilk() {
        return isMilk;
    }

    /**
     * Sets whether the food contains milk.
     *
     * @param isMilk True if the food contains milk, false otherwise.
     */
    public void setIsMilk(boolean isMilk) {
        this.isMilk = isMilk;
    }

    /**
     * Gets the rating of the food.
     *
     * @return The rating of the food.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the rating of the food.
     *
     * @param rating The rating to set.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Returns a string representation of the food object.
     *
     * @return A string representation of the food object.
     */
    @Override
    public String toString() {
        return "Food{"
                + "name='" + name + '\''
                + ", price=" + price
                + ", isMilk=" + isMilk
                + ", rating=" + rating
                + '}';
    }

    /**
     * Determines if this food can be changed to another food based on certain
     * attributes.
     *
     * @param other The other food to compare.
     * @return True if the food can be changed, false otherwise.
     */
    public boolean canChange(Food other) {
        return (this.isMilk == other.isMilk
                && this.rating == other.rating
                && this.price >= other.price);
    }
}
