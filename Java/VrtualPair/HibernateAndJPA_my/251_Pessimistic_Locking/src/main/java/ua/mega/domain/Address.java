package ua.mega.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Address {
    private String city;
    private String street;
    @Column(name="ZIP_OR_POSTCODE")
    private String zipOrPostcode;

    public Address() {
    }

    public Address(String city, String street, String zipOrPostcode) {
        this.city = city;
        this.street = street;
        this.zipOrPostcode = zipOrPostcode;
    }

    @Override
    public String toString() {
        return city + ", " + street + ", " + zipOrPostcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        return zipOrPostcode != null ? zipOrPostcode.equals(address.zipOrPostcode) : address.zipOrPostcode == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (zipOrPostcode != null ? zipOrPostcode.hashCode() : 0);
        return result;
    }
}
