package org.example.Gcollector;

import javax.swing.*;

public class GarbageCollector {
    public void test(){
        Integer añoModelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de el modelo de el Carro"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca de el carro");
        Carro carro = new Carro(añoModelo,marca);
        System.out.println("El carro se agrego con exito: \n" +
                "Año Modelo - " + carro.getAñoModelo() + "\n" +
                "Marca - " + carro.getMarca());
        Integer antiguedad = añoModelo;
        marca = null;
        carro = null;
        System.gc();
    }
}
