package com.company;

import java.util.ArrayList;
import java.util.List;

public class Parcare {
    int id;
    String nume;
    List<Locurideparcare> locuri = new ArrayList<>(100);

    Parcare(int id,String nume){
        this.id = id;
        this.nume = nume;
        for(int i = 0;i<100;i++){
            locuri.add(new Locurideparcare(i));
        }
    }
    Parcare(){
        this.id = 1;
        this.nume ="Parcarea 1";
    }
}
