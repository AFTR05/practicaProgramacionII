package org.example.referenceAnotations.references;

public class Cosa {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cosa(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    }
}
