package C;

/**
 * Models film studio with the following attributes.
 * studio name, studio's adress, the date the studio was founded.
 * @author ugpsy
 * @version 1.0
 */
public class Studio {
    private String name;
    private Address adress;
    private Date foundingDate;
    public Studio(String name, Address adress, Date foundingDate) {
        this.name = name;
        this.adress = adress;
        this.foundingDate = foundingDate;
    }
}
