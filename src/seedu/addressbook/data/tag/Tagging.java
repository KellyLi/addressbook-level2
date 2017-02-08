import seedu.addressbook.data.person.Person;

import java.util.ArrayList;

public class Tagging {
    private Person person;
    private String taggingOperation;
    private Tag tag;
    
    public Tagging(Person person, String taggingOperation, Tag tag) {
        this.person = person;
        this.taggingOperation = taggingOperation;
        this.tag = tag;
    }
    
    public Person getPerson() {
        return this.person;
    }
    
    public String getTaggingOperation() {
        return this.taggingOperation;
    }
    
    public Tag getTag(){
        return this.tag;
    }

}