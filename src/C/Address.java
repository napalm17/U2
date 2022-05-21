package C;

/**
 * Models an address with the following attributes:
 * Name of the street, name of the city, post code.
 * @author ugpsy
 * @version 1.0
 */
public class Address {
    private String streetName;
    private String cityName;
    private int postCode;

    public Address(String streetName, String cityName, int postCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.postCode = postCode;
    }
}
