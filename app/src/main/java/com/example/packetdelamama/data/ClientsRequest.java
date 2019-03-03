package com.example.packetdelamama.data;

public class ClientsRequest {
    public String adresa_livrare;
    public String adresa_ridicare;
    public String telefon_livrare;
    public String telefon_ridicare;
    public String data_ridicare;
    public String metoda_plata;

    public ClientsRequest(String adresa_ridicare, String adresa_livrare, String telefon_livrare, String telefon_ridicare, String data_ridicare, String metoda_plata) {
        this.adresa_livrare = adresa_livrare;
        this.adresa_ridicare = adresa_ridicare;
        this.telefon_livrare = telefon_livrare;
        this.data_ridicare = data_ridicare;
        this.telefon_ridicare = telefon_ridicare;
        this.metoda_plata = metoda_plata;
    }

}
