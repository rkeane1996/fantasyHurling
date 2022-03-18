package com.ronansProjects.fantasyHurling.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {

    @Id
    private int id;

    private String name;
    private String dob;
    private String address;
    private String countySupports;
    private int totalPoints;

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public User(String name, String dob, String address, String countySupports) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.countySupports = countySupports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountySupports() {
        return countySupports;
    }

    public void setCountySupports(String countySupports) {
        this.countySupports = countySupports;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", countySupports='" + countySupports + '\'' +
                '}';
    }
}
