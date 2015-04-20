//Created by Jonathan Duong
//GTiD 902970747
//jduong6@gatech.edu

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class GradeHistogram {

    public static void main(String[] args) {
        File fileA = new File(args[0]);
        int lines = lineCount(fileA);
        Scanner keys = new Scanner(System.in);
        int bucket = 0;
        int i = 0;
        int[] gradeArray = new int[lines];
        int[] gradeFrequency = new int[101];
        int bottom;
        System.out.println("Grades Loaded!");
        try {
            bucket = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.print("");
        } finally {
            System.out.print("");
        }
        if (bucket == 0) {
            System.out.println("What bucket size would you like?");
            bucket = Integer.parseInt(keys.nextLine());
        }
        try {
            Scanner file = new Scanner(new File(args[0]));
            while (file.hasNext()) {
                String line = file.nextLine();
                String num = line.replaceAll("[^0-9]+", "");
                int score = Integer.parseInt(num);
                gradeArray[i] = score;
                i++;
                gradeFrequency[score]++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println();
        for (int top = 100; top > 0; top = top - bucket) {
            bottom = top - (bucket - 1);
            if (bottom < 0) {
                bottom = 0;
            }
            int length = String.valueOf(top).length();
            if (length < 3) {
                System.out.print(" ");
            }
            if (length < 2) {
                System.out.print(" ");
            }
            System.out.print(top + " - ");
            int length2 = String.valueOf(bottom).length();
            if (length2 < 2) {
                System.out.print(" ");
            }
            System.out.print(bottom + " | ");
            for (int upper = top; upper > bottom; upper--) {
                if (bottom == 0) {
                    bottom--;
                }
                for (int j = 0; j < gradeFrequency[upper]; j++) {
                    System.out.print("[]");
                }
            }
            System.out.println();
            if (bottom == 1) {
                System.out.print("  0 -  0 | ");
                for (int k = 0; k < gradeFrequency[0]; k++) {
                    System.out.print("[]");
                }
                System.out.println();
            }
        }
    }

    private static int lineCount(File fileA) {
        int count = 0;
        try {
            Scanner fileC = new Scanner(fileA);
            while (fileC.hasNext()) {
                fileC.nextLine();
                count++;
            }
            fileC.close();
        } catch (IOException x) {
            x.printStackTrace();
        }
        return count;
    }
}
