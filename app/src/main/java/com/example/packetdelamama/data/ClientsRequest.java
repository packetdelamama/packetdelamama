package com.example.packetdelamama.data;

public class ClientsRequest {
    private String adresa_livrare;
    private String adresa_ridicare;
    private String telefon_livrare;
    private String telefon_ridicare;
    private String data_ridicare;
    private String metoda_plata;

    public ClientsRequest(String adresa_ridicare, String adresa_livrare, String telefon_livrare, String telefon_ridicare, String data_ridicare, String metoda_plata) {
        this.adresa_livrare = adresa_livrare;
        this.adresa_ridicare = adresa_ridicare;
        this.telefon_livrare = telefon_livrare;
        this.data_ridicare = data_ridicare;
        this.telefon_ridicare = telefon_ridicare;
        this.metoda_plata = metoda_plata;
    }

}
