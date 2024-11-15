package com.jmanrique.conversor_de_moneda.principal;

import com.jmanrique.conversor_de_moneda.modelos.ConsultaMoneda;
import com.jmanrique.conversor_de_moneda.modelos.ConversionMoneda;
import com.jmanrique.conversor_de_moneda.modelos.Moneda;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        ConversionMoneda convertirMoneda = new ConversionMoneda();
        Moneda moneda = null;
        double cantidad = 0;
        var mensaje = "Ingresa el valor que deseas convertir";

        var menu = """
                
                **************************************************
                Menú principal del Conversor de Moneda
                
                1). Dolar Estaunidense ==> Peso Colombiano
                2). Peso Colombiano    ==> Dolar Estaunidense
                3). Salir
                
                Elija una opción
                ***************************************************
                """;

        // menú
        var flag = false;
        try {
            while (!flag){
                System.out.println(menu);
                var opcionMoneda = Integer.parseInt(scanner.nextLine());
                if (opcionMoneda == 3){
                    flag = true;
                }

                switch (opcionMoneda){
                    case 1:
                        moneda = consulta.buscar("USD");
                        System.out.println(mensaje);
                        cantidad = Double.parseDouble(scanner.nextLine());
                        convertirMoneda.convertir(cantidad, "USD", "COP", moneda.conversion_rates());
                        break;
                    case 2:
                        moneda = consulta.buscar("COP");
                        System.out.println(mensaje);
                        cantidad = Double.parseDouble(scanner.nextLine());
                        convertirMoneda.convertir(cantidad, "COP", "USD", moneda.conversion_rates());
                        break;
                    default:
                        System.out.println("Saliendo del sistema!");
                        break;
                }

            }
        }catch (Exception e){
            System.out.println("Se presento un error en la conversión: " + e.getMessage());
        }
    }
}
