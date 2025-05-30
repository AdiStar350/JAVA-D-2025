
public class Picture {

    private Pixel[][] pixels = new Pixel[256][256];

    public boolean isBalancedPicture() {
        int blackPix = 0;
        int whitePix = 0;

        for (Pixel[] row : this.pixels) {
            for (Pixel pix : row) {
                if (pix.isBlack()) {
                    blackPix++;
                } else if (pix.isWhite()) {
                    whitePix++;
                }
            }
        }

        return blackPix == whitePix;
    }

    public boolean isBlackWhite() {
        for (Pixel[] row : this.pixels) {
            for (Pixel pix : row) {
                if (!(pix.isBlack() || pix.isWhite())) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setWhiteBorder() {
        for (int i = 0; i < this.pixels.length; i++) {
            for (int j = 0; j < this.pixels[i].length; j++) {
                if (j == 0
                        || i == 0
                        || j == this.pixels[i].length - 1
                        || i == this.pixels.length - 1) {
                    this.pixels[i][j].setBlue(255);
                    this.pixels[i][j].setGreen(255);
                    this.pixels[i][j].setRed(255);
                }
            }
        }
    }
}
