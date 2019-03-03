package com.example.packetdelamama.data;

public class DriversRequest {
    public String oras_plecare;
    public String oras_sosire;
    public String ora_plecare;
    public String data_plecare;
    public String pret_lei;

    public DriversRequest(String ora_plecare, String oras_sosire, String oras_plecare, String data_plecare, String pret_lei) {
        this.data_plecare = data_plecare;
        this.ora_plecare = ora_plecare;
        this.oras_plecare =  oras_plecare;
        this.oras_sosire = oras_sosire;
        this.pret_lei = pret_lei;
    }
}
