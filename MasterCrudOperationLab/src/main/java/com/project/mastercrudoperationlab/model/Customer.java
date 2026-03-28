package com.project.mastercrudoperationlab.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;
    private String phoneNumber;

    public Customer(){}

    public Customer(long id, String firstName, String lastName, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.email, this.phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer object)) return false;

        return Objects.equals(this.id, object.id)
                && Objects.equals(this.firstName, object.firstName)
                && Objects.equals(this.lastName, object.lastName)
                && Objects.equals(this.email, object.email)
                && Objects.equals(this.phoneNumber, object.phoneNumber);
    }
}
