package com.java.core;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class ImmutableClass {
    private final int id;
    private final String name;
    private final Address address;

    public ImmutableClass(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=new Address(address.getHouseNum(),address.getStreet());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
