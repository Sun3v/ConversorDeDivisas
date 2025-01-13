package com.alura.conversordivisas.principal;

import com.alura.conversordivisas.calculadora.Divisas;

import java.util.Map;
import java.util.Scanner;

public class Principal {

    private static final String MENU = """
            ****************************************************
            ¡Bienvenido/a al Conversor de Monedas!
            
            En este programa puedes elegir diferentes tipos de
            monedas para realizar conversiones.
            
            Elige una opción para convertir el monto interesado:
            
            1. Dólar a Peso Argentino
            2. Peso Argentino a Dólar
            3. Dólar a Real Brasilenio
            4. Real Brasilenio a Dólar
            5. Dólar a Peso Colombiano
            6. Peso Colombiano a Dólar
            7. Salir
            ****************************************************
            """;
    private static final String INVALID_OPTION_MESSAGE = "\nOpción no válida.";

    private static final Map<Integer, String[]> CONVERSIONS = Map.of(
            1, new String[]{"USD", "ARS"},
            2, new String[]{"ARS", "USD"},
            3, new String[]{"USD", "BRL"},
            4, new String[]{"BRL", "USD"},
            5, new String[]{"USD", "COP"},
            6, new String[]{"COP", "USD"}
    );

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Divisas conversorDivisas = new Divisas();
        int opcion = 0;

        while (opcion != 7) {
            mostrarMenu();
            try {
                System.out.print("Elige una opción válida: ");
                opcion = Integer.parseInt(entrada.nextLine());
                manejarOpcion(opcion, conversorDivisas, entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
            }
        }

        entrada.close();
    }

    private static void mostrarMenu() {
        System.out.println(MENU);
    }

    private static void manejarOpcion(int opcion, Divisas conversorDivisas, Scanner entrada) {
        String[] conversion = CONVERSIONS.get(opcion);
        if (conversion != null) {
            System.out.println("\nElegiste la opción " + conversion[0] + " a " + conversion[1]);
            try {
                conversorDivisas.calcularConversion(conversion[0], conversion[1], entrada);
            } catch (RuntimeException e) {
                System.out.println("Error en la conversión: " + e.getMessage());
            }
        } else if (opcion == 7) {
            System.out.println("\nElegiste la opción Salir\n");
            System.out.println("Saliendo del programa. Que tenga un buen día.");
        } else {
            System.out.println(INVALID_OPTION_MESSAGE);
        }
    }
}
