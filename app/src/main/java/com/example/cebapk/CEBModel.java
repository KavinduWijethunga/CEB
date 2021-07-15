package com.example.cebapk;

public class CEBModel {

    String name;
    String complain;
    double latitude;
    double longtitude;
    String address;

    public CEBModel(String name, String complain, double latitude, double longtitude, String address) {
        this.name = name;
        this.complain = complain;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getComplain() {
        return complain;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public String getAddress() {
        return address;
    }
}
