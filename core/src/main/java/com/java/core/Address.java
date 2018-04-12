package com.java.core;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class Address {
    private int houseNum;
    private String street;

    public Address(int houseNum, String street) {
        this.houseNum = houseNum;
        this.street = street;
    }

    public Address() {
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
