/**
 * This class represents a Professor object.
 * @author Jonathan Duong
 * @version 1.00
 */
public class Professor extends Person {
    private double funnyFactor;
    private double gpa;

    /**
     * This creates a professor.
     * @param funnyFactor is the funniness factor of professor
     * @param gpa is the professor's average gpa
     * @param firstName is the professor's first name
     * @param lastName is the professor's last name
     * @param username is the professor's username
     */
    public Professor(double funnyFactor, double gpa, String firstName,
        String lastName, String username) {
        super(firstName, lastName, username);
        if (!isValidFactor(funnyFactor)) {
            System.out.println(funnyFactor + " is not a valid funny factor.");
            System.exit(0);
        }
        this.funnyFactor = funnyFactor;

        if (!isValidGPA(gpa)) {
            System.out.println(gpa + " is not a valid gpa.");
            System.exit(0);
        }
        this.gpa = gpa;
    }

    /**
     * Checks if factor is between 0 and 1.
     * @param factor is the number being checked
     * @return true if the factor is between 0 and 1, and false otherwise
     */
    private boolean isValidFactor(double factor) {
        return ((factor >= 0) && (factor <= 1));
    }

    /**
     * Checks if gpa is between 0 and 4.
     * @param grade is the number being checked
     * @return true if the factor is between 0 and 4, and false otherwise
     */
    private boolean isValidGPA(double grade) {
        return ((grade >= 0) && (grade <= 4));
    }

    /**
     * Returns the gpa.
     * @return gpa
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Returns the funny factor.
     * @return funny factor
     */
    public double getFunnyFactor() {
        return funnyFactor;
    }

    /**
     * Sets a new GPA.
     * @param newGPA is the new GPA
     */
    public void setGPA(double newGPA) {
        if (!isValidGPA(newGPA)) {
            System.out.println(newGPA + " is not a valid gpa.");
            System.exit(0);
        }
        this.gpa = newGPA;
    }

    /**
     * Sets a new funny factor.
     * @param funnyFactor is the new funny factor
     */
    public void setFunnyFactor(double funnyFactor) {
        if (!isValidFactor(funnyFactor)) {
            System.out.println(funnyFactor + " is not a valid funny factor.");
            System.exit(0);
        }
        this.funnyFactor = funnyFactor;
    }
}
