package org.example.services.impl;

import org.example.model.Costumer;
import org.example.services.CostumerService;

import java.util.ArrayList;

public class CostumerServiceImpl implements CostumerService {
    private ArrayList<Costumer> costumers;

    @Override
    public ArrayList<Costumer> initializeCostumers() {
        costumers=new ArrayList<Costumer>();
        costumers.add(new Costumer(897L,"Pepe",2));
        costumers.add(new Costumer(451L,"Felipe",1));
        costumers.add(new Costumer(124L,"Nicolas",3));
        costumers.add(new Costumer(457L,"Harold",1));
        costumers.add(new Costumer(841L,"Valeria",2));
        costumers.add(new Costumer(965L,"Valentina",3));
        costumers.add(new Costumer(254L,"Laura",1));
        costumers.add(new Costumer(521L,"Gerardo",3));
        costumers.add(new Costumer(645L,"Esteban",2));
        costumers.add(new Costumer(784L,"Stephany",1));
        return costumers;
    }
}
