package com.prasertcbs;

import java.time.LocalDate;

/**
 * Created by prasert on 11/4/2014.
 */
public class Person {
    private String title, firstName, lastName; // English
    private String titleTh, firstNameTh, lastNameTh; // Thai
    private String titleCn, firstNameCn, lastNameCn; // Chinese
    private LocalDate dob;

    public Person(String title, String firstName, String lastName, LocalDate dob) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Person(String title, String firstName, String lastName,
                  String titleTh, String firstNameTh, String lastNameTh,
                  LocalDate dob) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.titleTh = titleTh;
        this.firstNameTh = firstNameTh;
        this.lastNameTh = lastNameTh;
        this.dob = dob;
    }

    public Person() {
    }

    public String getTitleTh() {
        return titleTh;
    }

    public void setTitleTh(String titleTh) {
        this.titleTh = titleTh;
    }

    public String getFirstNameTh() {
        return firstNameTh;
    }

    public void setFirstNameTh(String firstNameTh) {
        this.firstNameTh = firstNameTh;
    }

    public String getLastNameTh() {
        return lastNameTh;
    }

    public void setLastNameTh(String lastNameTh) {
        this.lastNameTh = lastNameTh;
    }

    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", titleTh='" + titleTh + '\'' +
                ", firstNameTh='" + firstNameTh + '\'' +
                ", lastNameTh='" + lastNameTh + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
