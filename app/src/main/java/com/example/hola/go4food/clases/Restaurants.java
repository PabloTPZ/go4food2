package com.example.hola.go4food.clases;

/**
 * Created by hola on 28/10/2016.
 */

public class Restaurants {
    String nombre;
    String tipo;
    String bebida;
    String Preparacion;
    String Distancia;
    int voto;
    int pesos;
    int logo;

    public Restaurants(String nombre, String distancia, String preparacion, String bebida, String tipo,int logo, int pesos, int voto) {
        this.nombre = nombre;
        this.logo = logo;
        this.pesos = pesos;
        this.voto = voto;
        Distancia = distancia;
        Preparacion = preparacion;
        this.bebida = bebida;
        this.tipo = tipo;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPesos() {
        return pesos;
    }

    public void setPesos(int pesos) {
        this.pesos = pesos;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String distancia) {
        Distancia = distancia;
    }

    public String getPreparacion() {
        return Preparacion;
    }

    public void setPreparacion(String preparacion) {
        Preparacion = preparacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
