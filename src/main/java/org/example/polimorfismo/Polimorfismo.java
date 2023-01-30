package org.example.polimorfismo;

public class Polimorfismo {

    Person person = new Person("Cardona",17);
    Policeman policeman = new Policeman("Coste",20);

    SoccerPlayer soccerPlayer = new SoccerPlayer("Juan Pablo",23);

    Person personToPolice = new Policeman("David",19);

    public void test(){
        person.saludar();
        System.out.printf("\n");
        policeman.saludar();
        System.out.printf("\n");
        soccerPlayer.saludar();
        System.out.printf("\n");
        personToPolice.saludar();
    }


}
