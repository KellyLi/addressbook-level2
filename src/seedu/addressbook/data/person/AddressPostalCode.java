package seedu.addressbook.data.person;

/**
 * Represents a Person's address postal code in the address book.
 */
public class AddressPostalCode {
    private final String value;
    
    public AddressPostalCode(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
