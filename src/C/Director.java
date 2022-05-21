package C;

/**
 * Models a director featuring in the film.
 * Similar to the class Actor, inherits attributes of the class "Person" such as
 * first name, last name and first feature date.
 * @author ugpsy
 * @version 1.0
 */
public class Director extends Person {
    public Director(String firstName, String lastName, Date firstFeatureDate) {
        super(firstName, lastName, firstFeatureDate);
    }
}
