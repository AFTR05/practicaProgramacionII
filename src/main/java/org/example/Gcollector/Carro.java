package org.example.Gcollector;

public class Carro {
    private Integer añoModelo;
    private String marca;

    public Carro(Integer añoModelo, String marca) {
        this.añoModelo = añoModelo;
        this.marca = marca;
    }

    public Integer getAñoModelo() {
        return añoModelo;
    }

    public void setAñoModelo(Integer añoModelo) {
        this.añoModelo = añoModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
