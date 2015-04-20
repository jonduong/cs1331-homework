/**
 * This represents a Person class.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Person {
    protected String name;
    protected String email;

    /**
     * This creates a person object.
     *
     * @param name is the name of the person
     * @param email is the email of the person
     */
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * This gets the name of the person.
     *
     * @return name of person
     */
    public String getName() {
        return name;
    }

    /**
     * This gets the email of the person.
     *
     * @return email of person
     */
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + " <" + email + ">";
    }
}
