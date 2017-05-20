package ua.mega.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class Address {
    private String street;
    private String city;
    @Column(name = "ZIP_OR_POSTCODE")
    private String zipOrPostcode;

    public Address() {
    }

    public Address(String street, String city, String zipOrPostcode) {
        this.street = street;
        this.city = city;
        this.zipOrPostcode = zipOrPostcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipOrPostcode='" + zipOrPostcode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return zipOrPostcode != null ? zipOrPostcode.equals(address.zipOrPostcode) : address.zipOrPostcode == null;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (zipOrPostcode != null ? zipOrPostcode.hashCode() : 0);
        return result;
    }
}
