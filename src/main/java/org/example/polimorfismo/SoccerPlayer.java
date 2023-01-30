package org.example.polimorfismo;

public class SoccerPlayer extends Person{
    public SoccerPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void work(){
        System.out.printf("Estoy entrenando futbol");
    }
}
