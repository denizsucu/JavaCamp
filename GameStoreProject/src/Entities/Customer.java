package Entities;

import Abstracts.Entity;

public class Customer implements Entity {
    private int id;
    private String nationalityId;
    private String firstName;
    private  String lastName;
    private int yearOfBirth;

    public Customer(){}

    public Customer(int id, String nationalityId, String firstName, String lastName, int yearOfBirth) {
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
