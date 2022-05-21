package C;

/**
 * Models an actor featuring in the film.
 * Inherits attributes of the class "Person" such as first name, last name and first feature date.
 * @author ugpsy
 * @version 1.0
 */
public class Actor extends Person{
    public Actor(String firstName, String lastName, Date firstFeatureDate) {
        super(firstName, lastName, firstFeatureDate);
    }
}
