package com.jmanrique.conversor_de_moneda.modelos;

import java.text.DecimalFormat;
import java.util.Map;

public class ConversionMoneda {
  public void convertir(double cantidad, String base, String convertirA, Map<String, String > moneda){

      DecimalFormat formatoDecimal = new DecimalFormat("#.#####"); // formato con hasta 6 decimales
      moneda.forEach((key, value) -> {
          if (key.equals(convertirA)) {
              double tasaConversion = Double.parseDouble(value);
              double resultado = tasaConversion * cantidad;
              System.out.println("El valor " + cantidad + " [" + base + "] corresponde al valor final de =>>> " +formatoDecimal.format(resultado) + " [" + convertirA + "]");
          }
      });
  }
}
