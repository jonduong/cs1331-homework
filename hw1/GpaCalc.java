//Created by Jonathan Duong
//GTiD 902970747
//jduong6@gatech.edu

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.text.DecimalFormat;

public class GpaCalc {

    public static void main(String[] args) {
        String semanswer = "y";
        Scanner keys = new Scanner(System.in);
        do {
            processInput();
            System.out.println("Would you like to calculate for another"
                + " semester? (y/n)");
            semanswer = keys.nextLine();
        } while (semanswer.equalsIgnoreCase("y"));
    }

    static void processInput() {
        String answer = "y";
        double hours = 0;
        double sums = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the semester:");
        String semester = keyboard.nextLine();
        String semLower = semester.toLowerCase();
        String title = semLower.replaceAll("\\s+", "");
        String text = title + ".txt";
        try {
            PrintWriter writer = new PrintWriter(text, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        do {
            System.out.println("Enter the course title:");
            String course = keyboard.nextLine();
            System.out.println("Enter the number of credits");
            int credits = keyboard.nextInt();
            System.out.println("Enter the grade (A=4, B=3, etc.)");
            int grade = keyboard.nextInt();
            String credreport = credits + " credits. Grade: ";
            double creditsd = (double) credits;
            double graded = (double) grade;
            sums = sums + (creditsd * graded);
            hours = hours + creditsd;
            try {
                Writer output = new BufferedWriter(new FileWriter(text, true));
                output.write(course + " - " + credreport + grade + "\n");
                output.flush();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            System.out.println("Would you like to enter another course? (y/n)");
            answer = keyboard.nextLine();
            /* There was this weird thing where it would take
               the return key as the input for answer, so I had to
               do it twice. */
            answer = keyboard.nextLine();
        } while (answer.equalsIgnoreCase("y"));
        DecimalFormat df = new DecimalFormat("#.00");
        double gpa = sums / hours;
        System.out.println("Overall GPA: " + df.format(gpa));
        try {
            Writer out = new BufferedWriter(new FileWriter(text, true));
            out.write("GPA: " + df.format(gpa));
            out.close();
        } catch (IOException x) {
            x.printStackTrace();
        }
    }
}
