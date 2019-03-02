package com.example.packetdelamama;

public class Ride {
    private Date pickupDate;
    private double price;
    private Car carInfo;
    private String phoneNumber;

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(Car carInfo) {
        this.carInfo = carInfo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Ride(Date pickupDate, double price, Car carInfo, String phoneNumber) {
        super();
        this.pickupDate = pickupDate;
        this.price = price;
        this.carInfo = carInfo;
        this.phoneNumber = phoneNumber;
    }
}
