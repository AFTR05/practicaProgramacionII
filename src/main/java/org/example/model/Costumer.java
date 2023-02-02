package org.example.model;

import org.example.herencia.Person;

public class Costumer extends Person  {

    private Integer tier;

    public Costumer(long id, String name, Integer tier) {
        super(id, name);
        this.tier = tier;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }
}
