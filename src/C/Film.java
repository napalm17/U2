package C;

public class Film {
    private final int CAST_SIZE = 100;
    private String title;
    private Director director;
    private Actor[] cast;
    private Date releaseDate;
    private Duration duration;
    private Studio studio;

    public Film(String title, Person director, Actor[] cast, Date releaseDate, Duration duration, Studio studio) {
        this.cast = new Actor [100];
        System.arraycopy(cast, 0, this.cast, 0, cast.length);
    }
}
