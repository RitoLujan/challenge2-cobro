package com.riot.compras.modelos;

public class Entretenimiento extends Producto{
    private String categoriaEntretenimiento;
    private String categoriaEdad;
    private boolean esDigital;

    public Entretenimiento(String nombreProducto, int precioProducto, String categoriaEntretenimiento,
                           String categoriaEdad, boolean esDigital) {
        super(nombreProducto, precioProducto);
        this.categoriaEntretenimiento = categoriaEntretenimiento;
        this.categoriaEdad = categoriaEdad;
        this.esDigital = esDigital;
    }
}
