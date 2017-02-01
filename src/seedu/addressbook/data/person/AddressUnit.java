package seedu.addressbook.data.person;

/**
 * Represents a Person's address unit in the address book.
 */
public class AddressUnit {
    private final String value;
    
    public AddressUnit(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
