package Aggregation;

public class Address {
    private String city;
    private String street;
    private String country;
    private int postNumber;

    public Address(String city, String street, String country, int postNumber) {
        this.city = city;
        this.street = street;
        this.country = country;
        this.postNumber = postNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
    public String getCountry() {
        return country;
    }

    public int getPostNumber() {
        return postNumber;
    }
}
