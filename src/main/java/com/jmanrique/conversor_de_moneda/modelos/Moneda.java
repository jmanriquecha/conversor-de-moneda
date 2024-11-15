package com.jmanrique.conversor_de_moneda.modelos;

import java.util.Map;

public record Moneda(String result, String time_last_update_utc, String base_code, Map<String, String> conversion_rates) {
}
