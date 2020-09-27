package com.company;

public class Client {
    int id;
    String nume,prenume;
    Parcare parcarea;


    public Client(int id, String nume, String prenume, Parcare parcarea) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.parcarea = parcarea;
    }
}
