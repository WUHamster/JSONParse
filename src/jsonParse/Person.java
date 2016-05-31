package jsonParse;

/**
 * Created by Bios on 07.02.2015.
 */
public class Person {
    String name;
    String surname;
    String[] phones;
    String[] sites;
    Address address;

    public String toString(){
        return name + " " + surname + " lives in " + address;
    }

    public void printPhones() {
        System.out.println("The phones are:");
        for (String phoneNumber : phones) {
            System.out.println(phoneNumber);
        }
    }

        public void printSites() {
        System.out.println("The sites are:");
        for (String siteAddress : sites) {
            System.out.println(siteAddress);
        }
    }



    public Person() {}
}
