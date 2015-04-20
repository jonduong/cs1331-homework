/**
 * This class represents a Person object
 * @author Jonathan Duong
 * @version 1.00
 */
public class Person {
    private String firstName;
    private String lastName;
    private String username;

    /**
     * This creates a person.
     * @param firstName is the first name
     * @param lastName is the last name
     * @param username is the username
     */
    public Person(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    /**
     * Returns the first name.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the username.
     * @return username
     */
    public String getUsername() {
        return username;
    }
}
