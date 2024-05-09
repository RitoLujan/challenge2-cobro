package com.riot.compras.principal;

import com.riot.compras.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static int comprarProducto(String producto, int precio, List<Producto> listaCompras, int creditoDisponible) {
        if (creditoDisponible < precio) {
            System.out.println("No cuentas con el crédito necesario para comprar " + producto);
        } else {
            listaCompras.add(new Producto(producto, precio));
            creditoDisponible -= precio;
            System.out.println("Compra de " + producto + " realizada. Crédito restante: " + creditoDisponible + "$");
        }
        return creditoDisponible;
    }

    public static void main(String[] args) {
        int opcion = 0;
        String opcionMenu;
        String comprasSeleccionada;
        int creditoTarjeta = 3000;
        Menu menu = new Menu();
        List<Producto> listaCompras = new ArrayList<>();
        List<Producto> listaProductosEnt = new ArrayList<>();
        List<Producto> listaProductosRop = new ArrayList<>();
        List<Producto> listaProductosAli = new ArrayList<>();
        Entretenimiento entretenimientoItem1 = new Entretenimiento("TV", 1000,
                "Entretenimiento", "Toda la familia", false);
        Entretenimiento entretenimientoItem2 = new Entretenimiento("Consola de Videojuegos", 500,
                "Videojuegos", "Toda la familia", false);
        Entretenimiento entretenimientoItem3 = new Entretenimiento("Videojuego", 250,
                "Videojuegos", "+13", true);
        Ropa ropaItem1 = new Ropa("Camisa", 100, "Gucci",
                "Blanco");
        Ropa ropaItem2 = new Ropa("Pantalon", 250, "Prada",
                "Negro");
        Ropa ropaItem3 = new Ropa("Zapatos", 50, "Levi",
                "Negro");
        Alimentos alimentosItem1 = new Alimentos("Pan Blanco", 2, "5g",
                false, "Bimbo");
        Alimentos alimentosItem2 = new Alimentos("Carne de res", 90, "1kg",
                true, "Rancho Alcala");
        Alimentos alimentosItem3 = new Alimentos("Soda", 18, "1/2kg",
                false, "Coca Cola");
        listaProductosEnt.add(entretenimientoItem1);
        listaProductosEnt.add(entretenimientoItem2);
        listaProductosEnt.add(entretenimientoItem3);
        listaProductosRop.add(ropaItem1);
        listaProductosRop.add(ropaItem2);
        listaProductosRop.add(ropaItem3);
        listaProductosAli.add(alimentosItem1);
        listaProductosAli.add(alimentosItem2);
        listaProductosAli.add(alimentosItem3);
        Scanner scanner = new Scanner(System.in);
        Scanner compras = new Scanner(System.in);

        menu.getMenuBienvenida();

        while (opcion != 4){
            menu.getMenuOpciones();
            opcionMenu = scanner.nextLine();

            switch (opcionMenu){
                case "1":
                    System.out.println("\nProductos de la seccion de Entretenimiento: ");
                    for ( Producto item: listaProductosEnt ){
                        System.out.println(item.getNombreProducto()+ ": " + item.getPrecioProducto() + "$");
                    }
                    System.out.println("\nProductos de la seccion de Ropa: ");
                    for ( Producto item: listaProductosRop ){
                        System.out.println(item.getNombreProducto()+ ": " + item.getPrecioProducto() + "$");
                    }
                    System.out.println("\nProductos de la seccion de Alimentos: ");
                    for ( Producto item: listaProductosAli ){
                        System.out.println(item.getNombreProducto()+ ": " + item.getPrecioProducto() + "$");
                    }
                    System.out.println();
                    break;

                case "2":
                    System.out.println("\nPor favor indique qué artículo desea comprar");
                    comprasSeleccionada = compras.nextLine();
                    int precioProducto = 0;
                    switch (comprasSeleccionada.toLowerCase()) {
                        case "tv":
                            precioProducto = entretenimientoItem1.getPrecioProducto();
                            break;
                        case "consola de videojuegos":
                            precioProducto = entretenimientoItem2.getPrecioProducto();
                            break;
                        case "videojuego":
                            precioProducto = entretenimientoItem3.getPrecioProducto();
                            break;
                        case "camisa":
                            precioProducto = ropaItem1.getPrecioProducto();
                            break;
                        case "pantalon":
                            precioProducto = ropaItem2.getPrecioProducto();
                            break;
                        case "zapatos":
                            precioProducto = ropaItem3.getPrecioProducto();
                            listaCompras.add(ropaItem3);
                            break;
                        case "pan blanco":
                            precioProducto = alimentosItem1.getPrecioProducto();
                            break;
                        case "carne de res":
                            precioProducto = alimentosItem2.getPrecioProducto();
                            break;
                        case "soda":
                            precioProducto = alimentosItem3.getPrecioProducto();
                            break;
                        default:
                            System.out.println("Producto no reconocido.");
                    }
                    creditoTarjeta = comprarProducto(comprasSeleccionada, precioProducto, listaCompras, creditoTarjeta);
                    break;

                case "3":
                    System.out.println("\nActualmente cuenta con: " + creditoTarjeta + "$ disponibles.\n");
                    break;

                case "4":
                    for ( Producto item: listaCompras ){
                        System.out.println("Articulo: "+item.getNombreProducto()+ " " + item.getPrecioProducto() + "$");
                    }
                    opcion = 4;
                    break;
            }
        }
        System.out.println("Que tengas un buen dia");
    }
}
