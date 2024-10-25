package com.example.demo.domain;

// Clase Item
public class Item {
    private String itemId;
    private String nombre;
    private double precio;

    public Item(String itemId, String nombre, double precio) {
        this.itemId = itemId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getItemId() {
        return itemId;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

