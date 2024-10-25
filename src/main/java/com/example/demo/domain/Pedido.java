package com.example.demo.domain;


// Clase Pedido
public class Pedido {
    private String itemId;
    private String userId;
    private int cantidadDeItems;

    public Pedido(String itemId, String userId, int cantidadDeItems) {
        this.itemId = itemId;
        this.userId = userId;
        this.cantidadDeItems = cantidadDeItems;
    }

    public String getItemId() {
        return itemId;
    }

    public String getUserId() {
        return userId;
    }

    public int getCantidadDeItems() {
        return cantidadDeItems;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setCantidadDeItems(int cantidadDeItems) {
        this.cantidadDeItems = cantidadDeItems;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

