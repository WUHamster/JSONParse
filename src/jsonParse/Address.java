package jsonParse;

/**
 * Created by Bios on 07.02.2015.
 */
public class Address {
    String city;
    String country;
    String street;

    public String toString() {
        return city + ", " + country + ", on " + street + " street.";
    }

    public Address() {}
}
