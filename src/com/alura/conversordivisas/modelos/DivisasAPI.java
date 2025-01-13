package com.alura.conversordivisas.modelos;

public record DivisasAPI(
        String base_code,
        String target_code,
        double conversion_rate
) {
}
