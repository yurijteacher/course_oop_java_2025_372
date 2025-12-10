package ua.com.kisit.lab5;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Address {

    private Long id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    private Customers customer;


//    public Address() {
//    }
//
//    public Address(Long id, String street, String city, String state, String zip, String country, Customers customer) {
//        this.id = id;
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//        this.country = country;
//        this.customer = customer;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "id=" + id +
//                ", street='" + street + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", zip='" + zip + '\'' +
//                ", country='" + country + '\'' +
//                '}';
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getZip() {
//        return zip;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public Customers getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customers customer) {
//        this.customer = customer;
//    }
}
