package seedu.addressbook.data.person;

/**
 * Represents a Person's address block in the address book.
 */
public class AddressBlock {
    private final String value;
    
    public AddressBlock(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }

}
