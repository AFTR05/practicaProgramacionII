package org.example.polimorfismo;
public class Policeman extends Person{
    public Policeman(String name, int age){

        super(name,age);

    }
    @Override
    public void work(){
        System.out.printf("Estoy atrapando ladrones...");
    }

    public void catchingDeliquent(){
        System.out.printf("Estoy atrapando delincuentes...");
    }
    public void catchingDeliquent(String deliquentName){
        System.out.printf("Estoy atrapando al delincuente " + deliquentName);
    }
    public void saludar(){
        System.out.printf("Hola soy un policia, me llamo "+ this.getName() );
    }

}
