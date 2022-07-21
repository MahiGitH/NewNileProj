package com.bluenile.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable=false, unique = true, length = 45)
    private String email;

    @Column(name = "password", nullable=false, unique = true, length = 45)
    private String password;

    @Column(name = "first_name", nullable=false, length = 45)
    private String firstName;


    @Column(name = "last_name", nullable=false, length = 45)
    private String lastName;


    @Column(name = "phone_name", nullable=false, length = 15)
    private String phoneNumber;


    @Column(name = "address_line_1", nullable=false, length = 64)
    private String addressLine1;

    @Column(name = "address_line_2", nullable=false, length = 64)
    private String addressLine2;

    @Column(name = "city", nullable=false, length = 45)
    private String city;

    @Column(name = "state", nullable=false, length = 2)
    private String state;

    @Column(name = "zipcode", nullable=false, length = 10)
    private String zipCode;

    public Customer() {
    }

    public Customer(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
