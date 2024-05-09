package com.riot.compras.modelos;

public class Ropa extends Producto{
    private String marcaDeLaPrenda;
    private String colorDeLaPrenda;

    public Ropa(String nombreProducto, int precioProducto, String marcaDeLaPrenda, String colorDeLaPrenda) {
        super(nombreProducto, precioProducto);
        this.marcaDeLaPrenda = marcaDeLaPrenda;
        this.colorDeLaPrenda = colorDeLaPrenda;
    }
}
