/**
 * This class represents a Student.
 * @author Jonathan Duong
 * @version 1.00
 */
public class Student extends Person {
    protected int studyHours;
    protected int nonStudyHours;

    /**
     * This creates a student object.
     * @param firstName is the first name of the student
     * @param lastName is the last name of the student
     * @param username is the username of the student
     */
    public Student(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
        this.studyHours = 0;
        this.nonStudyHours = 0;
    }

    /**
     * Returns the number of hours studied.
     * @return hours studied
     */
    public int getStudyHours() {
        return studyHours;
    }

    /**
     * Returns the number of hours not studied.
     * @return number of hours not studied
     */
    public int getNonStudyHours() {
        return nonStudyHours;
    }

    /**
     * Gets the percentage of hours studied from the total hours.
     * @return percentage of hours studied over total
     */
    public double getStudyPercentage() {
        double percent = ((double) studyHours / (double) ( studyHours +
            nonStudyHours));
        return percent;
    }

    /**
     * Adds to the total hours studied.
     * @param hours to be added to total hours studied
     */
    public void study(int hours) {
        studyHours += Math.abs(hours);
    }

    /**
     * Adds to the total hours not studied.
     * @param hours to be added to total hours not studied
     */
    public void relax(int hours) {
        nonStudyHours += Math.abs(hours);
    }
}
