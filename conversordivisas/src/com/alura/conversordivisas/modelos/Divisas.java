package com.alura.conversordivisas.modelos;

public class Divisas {

    private String divisaOrigen;
    private String divisaPorConvertir;
    private double conversion;

    public Divisas() {
    }

    public Divisas(String divisaOrigen, String divisaPorConvertir, double tasaConvertido) {
        this.divisaOrigen = divisaOrigen;
        this.divisaPorConvertir = divisaPorConvertir;
        this.conversion = tasaConvertido;
    }

    public Divisas(DivisasAPI exchangeAPI) {

        this.divisaOrigen = exchangeAPI.base_code();
        this.divisaPorConvertir = exchangeAPI.target_code();
        this.conversion = Double.valueOf(exchangeAPI.conversion_rate());

    }

    public String getDivisaOrigen() {
        return divisaOrigen;
    }

    public String getDivisaPorConvertir() {
        return divisaPorConvertir;
    }

    public double getTasaConvertido() {
        return conversion;
    }

}
