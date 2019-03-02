package com.example.packetdelamama;

public class Car {
    private String plateNumber;
    private String color;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String plateNumber, String color) {
        super();
        this.plateNumber = plateNumber;
        this.color = color;
    }
}
