package grepp.prgrms.springbootjpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public void changeId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }
}
