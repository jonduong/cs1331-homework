/**
 * This class processes the images.
 * @author Jonathan Duong
 * @version 1.00
 */
public final class ImageProcessor {
    private Pixel[][] thePixelz;
    private Pic copyImage;

    /**
     * Creates an ImageProcessor class that points at a picture.
     * @param image the image to be processed
     */
    public ImageProcessor(Pic image) {
        copyImage = image.deepCopy();
        thePixelz = copyImage.getPixels();
    }

    /**
     * Increases the value of each red, blue, and green by an increment.
     * @param increment the number the values are increased by
     * @return the changed picture
     */
    public Pic add(int increment) {
        for (Pixel[] thePixels : thePixelz) {
            for (Pixel pix : thePixels) {
                if (pix.getRed() + increment > 255) {
                    pix.setRed(255);
                } else if (pix.getRed() + increment < 0) {
                    pix.setRed(0);
                } else {
                    pix.setRed(pix.getRed() + increment);
                }

                if (pix.getGreen() + increment > 255) {
                    pix.setGreen(255);
                } else if (pix.getGreen() + increment < 0) {
                    pix.setGreen(0);
                } else {
                    pix.setGreen(pix.getGreen() + increment);
                }

                if (pix.getBlue() + increment > 255) {
                    pix.setBlue(255);
                } else if (pix.getBlue() + increment < 0) {
                    pix.setBlue(0);
                } else {
                    pix.setBlue(pix.getBlue() + increment);
                }
            }
        }
        return copyImage;
    }

    /**
     * Multiplies the value of each red, blue, and green by an scale.
     * @param scale the number the values are multiplied by
     * @return the changed picture
     */
    public Pic multiply(double scale) {
        for (Pixel[] thePixels : thePixelz) {
            for (Pixel pix : thePixels) {
                if (pix.getRed() * scale > 255) {
                    pix.setRed(255);
                } else if (pix.getRed() * scale < 0) {
                    pix.setRed(0);
                } else {
                    double r = pix.getRed() * scale;
                    pix.setRed((int) r);
                }

                if (pix.getGreen() * scale > 255) {
                    pix.setGreen(255);
                } else if (pix.getGreen() * scale < 0) {
                    pix.setGreen(0);
                } else {
                    double g = pix.getGreen() * scale;
                    pix.setGreen((int) g);
                }

                if (pix.getBlue() * scale > 255) {
                    pix.setBlue(255);
                } else if (pix.getBlue() * scale < 0) {
                    pix.setBlue(0);
                } else {
                    double b = pix.getBlue() * scale;
                    pix.setBlue((int) b);
                }
            }
        }
        return copyImage;
    }

    /**
     * Takes in a Pixel and sets the alpha of any similar Pixels to 0.
     * @param key the Pixel that is compared to the other Pixels
     * @param dr the range red has to be in to be considered similar
     * @param dg the range green has to be in to be considered similar
     * @param db the rande blue has to be in to be considered similar
     * @return the image with the changed alphas
     */
    public Pic chroma(Pixel key, int dr, int dg, int db) {
        for (Pixel[] thePixels : thePixelz) {
            for (Pixel pix : thePixels) {
                if (Math.abs(pix.getRed() - key.getRed()) < dr
                    && Math.abs(pix.getGreen() - key.getGreen()) < dg
                    && Math.abs(pix.getBlue() - key.getBlue()) < db) {
                    pix.setAlpha(0);
                }
            }
        }
        return copyImage;
    }

    /**
     * Replaces Pixel of image with Pixel of background if alpha is 0.
     * @param bg the background
     * @return the image with the new background
     */
    public Pic background(Pic bg) {
        int y = 0;
        for (Pixel[] thePixels : thePixelz) {
            int x = 0;
            for (Pixel pix : thePixels) {
                Pixel bgPix = bg.getPixel(x, y);
                if (pix.getAlpha() == 0) {
                    pix.setRed(bgPix.getRed());
                    pix.setGreen(bgPix.getGreen());
                    pix.setBlue(bgPix.getBlue());
                }
                x++;
            }
            y++;
        }
        return copyImage;
    }

}
