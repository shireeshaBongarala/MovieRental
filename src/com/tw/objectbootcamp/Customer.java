package com.tw.objectbootcamp;


public class Customer {
    private String title;
    private String firstName;
    private String lastName;

    private String city;
    private String postCode;
    private String country;

    public Customer(String title, String firstName, String lastName, String city, String postCode, String country) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCustomerSummary() {
        return getCustomerSummary(getTitle(), getFirstName(), getLastName(), getCity(), getCountry(), getPostCode());
    }

    private String getCustomerSummary(String title, String firstName, String lastName, String city, String country, String postCode) {
        return title + " " + firstName + " " + lastName + " " + city + " " + country + " " + postCode;
    }
}
