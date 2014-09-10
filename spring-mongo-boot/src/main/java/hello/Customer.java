package hello;

import org.springframework.data.annotation.Id;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String createdOn;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdOn = new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm:ss z").format(new Date());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', createdOn='%s']",
                id, firstName, lastName, createdOn);
    }
}
