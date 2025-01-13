package com.alura.conversordivisas.calculadora;

import com.alura.conversordivisas.conexiones.ConsultaAPI;
import com.alura.conversordivisas.modelos.DivisasAPI;

import java.util.Scanner;

public class Divisas {

    public void calcularConversion(String monedaBase, String monedaObjetivo, Scanner teclado) {

        double monto;
        double montoTotal;

        ConsultaAPI consultar = new ConsultaAPI();

        System.out.println("\nIngresa el monto que deseas convertir:");

        try {
            monto = Double.parseDouble(teclado.nextLine());

            // Realiza la consulta a la API
            DivisasAPI divisasAPI = consultar.divisaBusqueda(monedaBase, monedaObjetivo);

            // Realiza el cálculo de conversión
            double tasaConversion = divisasAPI.conversion_rate();
            montoTotal = monto * tasaConversion;

            // Imprime el resultado
            System.out.println("\nEl valor %.2f [%s] corresponde al valor final de: %.2f [%s]\n"
                    .formatted(monto, monedaBase, montoTotal, monedaObjetivo));

        } catch (NumberFormatException e) {
            System.out.println("Ingresa un monto válido por favor.");
        } catch (RuntimeException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}
