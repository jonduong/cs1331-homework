/**
 * This represents a Course class.
 * @author Jonathan Duong
 * @version 1.00
 */
public class Course {
    private String title;
    private Professor professor;
    private TA headTA;
    private TA[] tas;
    private Student[] students;

    /**
     * This creates a course object.
     * @param title is the title of the course
     * @param professor is the professor of the course
     * @param headTA is the head teacher assistant of the course
     * @param tas is the list of teacher assistants in the course
     * @param students is the list of students in the course
     */
    public Course(String title, Professor professor, TA headTA, TA[] tas,
        Student[] students) {
        this.title = title;
        this.professor = professor;
        this.headTA = headTA;
        if (tas.length > 15) {
            System.out.println(tas.length + " is too many TAs.");
        }
        this.tas = tas;

        if (students.length > 300) {
            System.out.println(students.length + " is too many students.");
        }
        this.students = students;
    }

    /**
     * Returns the title of the course.
     * @return title of the course
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the professor of the course.
     * @return professor of the course
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Returns the head teacher assistant of the course.
     * @return head teacher assistant of the course
     */
    public TA getHeadTA() {
        return headTA;
    }

    /**
     * Returns the list of teacher assistants in the course.
     * @return array of teacher assistants in the course
     */
    public TA[] getTAs() {
        return tas;
    }

    /**
     * Returns the list of students in the course.
     * @return array of students in course
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Calculates percentage of study time with total time of all students.
     * @return percentage of study time to total of all students
     */
    public double getAverageStudyRatio() {
        double totalScore = 0;
        int studentCount = 0;
        for (Student student : students) {
            totalScore += student.getStudyPercentage();
            studentCount++;
        }
        double ratio = totalScore / (double) studentCount;
        return ratio;
    }

    /**
     * Adds a new student to the class.
     * @param s is the new student object
     */
    public void addStudent(Student s) {
        Student[] newClass = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newClass[i] = students[i];
        }
        newClass[students.length] = s;
        this.students = newClass;
    }
}
