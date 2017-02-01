package seedu.addressbook.data.person;

/**
 * Represents a Person's address street in the address book.
 */
public class AddressStreet {
    private final String value;
    
    public AddressStreet(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
