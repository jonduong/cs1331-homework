/**
 * This class represents a teacher assistant.
 * @author Jonathan Duong
 * @version 1.00
 */
public class TA extends UndergradStudent {
    private double piazzaScore;
    private double recitationScore;
    private double officeHoursScore;

    /**
     * This creates a teacher assistant object.
     * @param piazzaScore is their piazza score
     * @param recitationScore is their recitation score
     * @param officeHoursScore is their office hours score
     * @param firstName is their first name
     * @param lastName is their last name
     * @param username is their username
     */
    public TA(double piazzaScore, double recitationScore,
        double officeHoursScore, String firstName, String lastName,
        String username) {
        super(firstName, lastName, username);
        if (!isValidScore(piazzaScore)) {
            System.out.println(piazzaScore + " is not a valid score.");
            System.exit(0);
        }
        this.piazzaScore = piazzaScore;

        if (!isValidScore(recitationScore)) {
            System.out.println(recitationScore + " is not a valid score.");
            System.exit(0);
        }
        this.recitationScore = recitationScore;

        if (!isValidScore(officeHoursScore)) {
            System.out.println(officeHoursScore + " is not a valid score.");
            System.exit(0);
        }
        this.officeHoursScore = officeHoursScore;
    }

    /**
     * This returns whether the score is between 0 or 1.
     * @return true if score is between 0 and 1, and false otherwise
     */
    private boolean isValidScore(double score) {
        return ((score >= 0) && (score <= 1));
    }

    /**
     * Returns the piazza score of the teacher assistant.
     * @return piazza score
     */
    public double getPiazzaScore() {
        return piazzaScore;
    }

    /**
     * Returns the recitation score of the teacher assistant.
     * @return recitation score
     */
    public double getRecitationScore() {
        return recitationScore;
    }

    /**
     * Returns the office hours score of the teacher assistant.
     * @return office hours score
     */
    public double getOfficeHoursScore() {
        return officeHoursScore;
    }

    /**
     * Sets a new piazza score of the teacher assistant.
     * @param piazzaScore is the piazza score to be set.
     */
    public void setPiazzaScore(double piazzaScore) {
        if (!isValidScore(piazzaScore)) {
            System.out.println(piazzaScore + " is not a valid score.");
            System.exit(0);
        }
        this.piazzaScore = piazzaScore;
    }

    /**
     * Sets a new recitation score of the teacher assitant.
     * @param recitationScore is the new reciation score
     */
    public void setRecitationScore(double recitationScore) {
        if (!isValidScore(recitationScore)) {
            System.out.println(recitationScore + " is not a valid score.");
            System.exit(0);
        }
        this.recitationScore = recitationScore;
    }

    /**
     * Sets a new office hours score for the teacher assistant.
     * @param officeHoursScore is he new office hours score
     */
    public void setOfficeHoursScore(double officeHoursScore) {
        if (!isValidScore(officeHoursScore)) {
            System.out.println(officeHoursScore + " is not a valid score.");
            System.exit(0);
        }
        this.officeHoursScore = officeHoursScore;
    }
}
