package sg.edu.nus.iss.app.ssf.assessment.pizza.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Order {
    
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, message = "Name must be min. 3 characters")
    private String name;

    @NotNull(message = "Name cannot be null")
    private String address;

    @Size(min = 8, message = "Phone number must be at least 8 digits.")
    private String phoneNumber;
    
    private Boolean rush;
    private String comments;  

    public Order() {
    }
    public Order(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Order(String name, String address, String phoneNumber, String comments) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.comments = comments;
    }
    public Order(String name, String address, String phoneNumber, Boolean rush) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rush = rush;
    }
    public Order(String name, String address, String phoneNumber, Boolean rush, String comments) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rush = rush;
        this.comments = comments;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Boolean getRush() {
        return rush;
    }
    public void setRush(Boolean rush) {
        this.rush = rush;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Delivery [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", rush=" + rush
                + ", comments=" + comments + "]";
    }

}
