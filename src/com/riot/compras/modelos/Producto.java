package com.riot.compras.modelos;

public class Producto {
    private String nombreProducto;
    private int precioProducto;

    public Producto(String nombreProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }
}
