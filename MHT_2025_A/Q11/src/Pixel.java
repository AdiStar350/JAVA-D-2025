
public class Pixel {

    private int red;
    private int green;
    private int blue;

    public Pixel(int blue, int green, int red) {
        this.blue = blue;
        this.green = green;
        this.red = red;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "Pixel{"
                + "red=" + red
                + ", green=" + green
                + ", blue=" + blue
                + '}';
    }

    public boolean isBlack() {
        return this.blue == 0
                && this.red == 0
                && this.green == 0;
    }

    public boolean isWhite() {
        return this.blue == 255
                && this.red == 255
                && this.green == 255;
    }

}
