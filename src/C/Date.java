package C;

/**
 * Models a date with the following attributes:
 * year, day (1-31), month.
 * @author ugpsy
 * @version 1.0
 */
public class Date {
    private int year;
    private int day;
    private Month month;

    public Date(int year, int day, Month month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

}
