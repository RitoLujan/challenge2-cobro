package com.riot.compras.modelos;

import java.time.LocalDateTime;

public class Menu {
    private final String menuBienvenida = """
                             
                          %sth %s %s %s:%s
            Bienvenido a su terminal de compras personal Riot
            actualmente cuenta con un credito de 3000$ en su tarjeta
            """.formatted(LocalDateTime.now().getDayOfMonth(), LocalDateTime.now().getMonth(),
            LocalDateTime.now().getYear(), LocalDateTime.now().getHour(), LocalDateTime.now().getMinute());

    private String menuOpciones = """
            Porfavor seleccione una opcion:
            1. Ver Catalogo de Productos.
            2. Comprar Productos.
            3. Consultar Limite de Credito.
            4. Finalizar Compras.
            """;

    public void getMenuBienvenida() {
        System.out.print(menuBienvenida);
    }

    public void getMenuOpciones() {
        System.out.print(menuOpciones);
    }
}
