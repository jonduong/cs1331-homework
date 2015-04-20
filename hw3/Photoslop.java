import java.io.IOException;
/**
 * This is the code given to process images.
 * @author Jonathan Duong ...part of it anyways.
 * @version 1.10
 */
public class Photoslop {
    /**
     * The main method. It runs the program in the command line.
     * @param args arguments for use 
     */
    public static void main(String... args) throws IOException {

        if (args.length < 4) {
            printUsage();
            System.exit(0);
        }
        try {
            ImageProcessor image = new ImageProcessor(new Pic(args[1]));

            if (args[0].equals("-a")) {
                Pic image2 = image.add(Integer.parseInt(args[2]));
                image2.save(args[3]);
            } else if (args[0].equals("-m")) {
                Pic image2 = image.multiply(Integer.parseInt(args[2]));
                image2.save(args[3]);
            } else if (args[0].equals("-c")) {
                Pixel chromaKey = new Pixel(26, 185, 19, 1);
                Pic image2 = image.chroma(chromaKey, 20, 40, 20);
                ImageProcessor image3 = new ImageProcessor(image2);
                Pic image4 = image3.background(new Pic(args[2]));
                image4.save(args[3]);
            } else {
                printUsage();
            }
        } catch (IOException ex) {
            System.out.println("One of the files you referenced does not exist,"
                + " or is corrupted. Double-check and try again.");
        }
    }

    private static void printUsage() {
        System.out.println("Add mode: ");
        System.out.println("java -a imageFile n outputFile");
        System.out.println("");
        System.out.println("Multiply mode: ");
        System.out.println("java -m imageFile n outputFile");
        System.out.println("");
        System.out.println("Greenscreen mode: ");
        System.out.println("java -c imageFile backgroundFile outputFile");
    }
}
