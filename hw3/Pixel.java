/**
 * This class represents a Pixel in an image.
 * @author Jonathan Duong
 * @version 1.00
 */
public class Pixel {
    private int red;
    private int blue;
    private int green;
    private int alpha;

    /**
     * Creates a Pixel with an array of red, green, blue, and alpha.
     * @param red value for pixel
     * @param green value for pixel
     * @param blue value for pixel
     * @param alpha value for pixel
     */
    public Pixel(int red, int green, int blue, int alpha) {
        if (!isValidValue(red)) {
            System.out.println(red + " is not a valid value.");
            System.exit(0);
        }
        this.red = red;

        if (!isValidValue(green)) {
            System.out.println(green + " is not a valid value.");
            System.exit(0);
        }
        this.green = green;

        if (!isValidValue(blue)) {
            System.out.println(blue + " is not a valid value.");
            System.exit(0);
        }
        this.blue = blue;

        if (!isValidValue(alpha)) {
            System.out.println(alpha + " is not a valid value.");
            System.exit(0);
        }
        this.alpha = alpha;
    }

    /**
     * Checks if the value is between 0 and 255.
     * @param value the number that is checked
     */
    private boolean isValidValue(int value) {
        return ((value >= 0) && (value <= 255));
    }

    /**
     * Returns the red value.
     * @return red value
     */
    public int getRed() {
        return red;
    }

    /**
     * Returns the green value.
     * @return green value
     */
    public int getGreen() {
        return green;
    }

    /**
     * Returns the blue value.
     * @return blue value
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Returns the alpha value.
     * @return alpha value
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Sets a new red value.
     * @param newRed the new red value
     */
    public void setRed(int newRed) {
        if (!isValidValue(newRed)) {
            System.out.println(newRed + " is not a valid value.");
            System.exit(0);
        }
        this.red = newRed;
    }

    /**
     * Sets a new green value.
     * @param newGreen the new green value
     */
    public void setGreen(int newGreen) {
        if (!isValidValue(newGreen)) {
            System.out.println(newGreen + " is not a valid value.");
            System.exit(0);
        }
        this.green = newGreen;
    }

    /**
     * Sets a new blue value.
     * @param newBlue the new blue value
     */
    public void setBlue(int newBlue) {
        if (!isValidValue(newBlue)) {
            System.out.println(newBlue + " is not a valid value.");
            System.exit(0);
        }
        this.blue = newBlue;
    }

    /**
     * Sets a new alpha value.
     * @param newAlpha the new alpha value
     */
    public void setAlpha(int newAlpha) {
        if (!isValidValue(newAlpha)) {
            System.out.println(newAlpha + " is not a valid value.");
            System.exit(0);
        }
        this.alpha = newAlpha;
    }
}
