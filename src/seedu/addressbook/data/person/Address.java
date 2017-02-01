package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.AddressBlock;
import seedu.addressbook.data.person.AddressStreet;
import seedu.addressbook.data.person.AddressUnit;
import seedu.addressbook.data.person.AddressPostalCode;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "a/123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses should be in the format: Block, Street, Unit, Postal Code";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final String ADDRESS_SEPARATOR = ",";

    public final String value;
    private boolean isPrivate;
    
    private final AddressBlock addressBlock;
    private final AddressStreet addressStreet;
    private final AddressUnit addressUnit;
    private final AddressPostalCode addressPostalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        String[] addressComponents = trimmedAddress.split(ADDRESS_SEPARATOR);
 
        for (int i=0; i < addressComponents.length; i++) {
            if (!isValidAddress(addressComponents[i]) || addressComponents.length < 4) {
                throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
            }
        }
        
        this.addressBlock = new AddressBlock(addressComponents[0]);
        this.addressStreet = new AddressStreet(addressComponents[1]);
        this.addressUnit = new AddressUnit(addressComponents[2]);
        this.addressPostalCode = new AddressPostalCode(addressComponents[3]);
        
        this.value = this.addressBlock.getValue() + ADDRESS_SEPARATOR + this.addressStreet.getValue() + ADDRESS_SEPARATOR
                    + this.addressUnit.getValue() + ADDRESS_SEPARATOR + this.addressPostalCode.getValue();
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
