package org.example;
import java.util.List;

public class Hobby{
    public String hobbyName;
    public int frequency;
    List<Address> addresses;

    public Hobby(String hobbyName, int frequency, List<Address> addresses) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + addresses +
                '}';
    }
}
