package C;

/**
 * Models a person, works as parent class for child classes "Actor" and "Director" for the sake of simplicity
 * @author ugpsy
 * @version 1.0
 */
public class Person {
    String firstName;
    String lastName;
    Date firstFeatureDate;
    public Person(String firstName, String lastName, Date firstFeatureDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstFeatureDate = firstFeatureDate;
    }
}
