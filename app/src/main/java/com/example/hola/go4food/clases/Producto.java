package com.example.hola.go4food.clases;

/**
 * Created by hola on 29/10/2016.
 */

public class Producto {
    int imagen;
    float precio;
    int cantidad;
    String cafe;

    public Producto(int imagen, float precio, int cantidad, String cafe) {
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cafe = cafe;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }
}
