/**
 * This class represents a graduate student.
 * @author Jonathan Duong
 * @version 1.00
 */
public class GradStudent extends Student {

    /**
     * This creates a graduate student object.
     * @param firstName is the first name of the graduate student
     * @param lastName is the last name of the graduate student
     * @param username is the username of the graduate student
     */
    public GradStudent(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
        this.studyHours = 0;
        this.nonStudyHours = 0;
    }

    /**
     * Overides the previous relax method. Can't increase.
     * @param hours nothing happens. nonStudyHours won't increase.
     */
    @Override
    public void relax(int hours) {
        this.nonStudyHours = 0;
    }
}
