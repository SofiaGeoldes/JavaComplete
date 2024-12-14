package org.example;
import java.util.ArrayList;
import java.util.List;

public class Address {
    public String address;
    Country country;


    public Address(String address, Country country) {
        this.address = address;
        this.country = country;

    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", country=" + country +
                '}';
    }
}

