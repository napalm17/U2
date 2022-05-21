package C;

/**
 * This enumerator models months in a year.
 * @author ugpsy
 * @version 1.0
 */
public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int number;

    Month (int number) {
        this.number = number;
    }
}
