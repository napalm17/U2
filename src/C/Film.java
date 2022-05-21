package C;

/**
 * Models a film with the following attributes.
 * its title, director, cast, release date, duration, studio.
 * @author ugpsy
 * @version 1.0
 */
public class Film {
    private final int CAST_SIZE = 100; // Maximum number of actors that can feature in a film should be 100.
    private String title;
    private Director director;
    private final Actor[] cast; // An array for actors featuring in the film
    private Date releaseDate;
    private Duration duration;
    private Studio studio;

    public Film(String title, Director director, Actor[] cast, Date releaseDate, Duration duration, Studio studio) {
        this.title = title;
        this.director = director;
        this.cast = new Actor [100];
        System.arraycopy(cast, 0, this.cast, 0, cast.length); // used this instead of simply doing
                                                                            // this.cast = cast, because the array cast
                                                                            // doesn't have to contain exactly 100 actors
                                                                            // it can also be less.
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.studio = studio;
    }
}
