package com.company;

public class OOP {
    public static void main(String[] args) {
        Parcare oParcare = new Parcare(1,"Parcaarea de La Botanica");

        Client client1 = new Client(1,"Vasea","Radu",oParcare);

        System.out.println(client1.parcarea.locuri);
    }
}
