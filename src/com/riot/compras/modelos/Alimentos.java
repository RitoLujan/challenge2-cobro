package com.riot.compras.modelos;

public class Alimentos extends Producto{
    private String pesoDelAlimento;
    private boolean esAGranel;
    private String marcaDelAlimento;

    public Alimentos(String nombreProducto, int precioProducto, String pesoDelAlimento, boolean esAGranel,
                     String marcaDelAlimento) {
        super(nombreProducto, precioProducto);
        this.pesoDelAlimento = pesoDelAlimento;
        this.esAGranel = esAGranel;
        this.marcaDelAlimento = marcaDelAlimento;
    }
}
