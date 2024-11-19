package com.jmanrique.conversor_de_moneda.principal;

import com.jmanrique.conversor_de_moneda.modelos.ConsultaMoneda;
import com.jmanrique.conversor_de_moneda.modelos.ConversionMoneda;
import com.jmanrique.conversor_de_moneda.modelos.Moneda;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversionMoneda valor = new ConversionMoneda();
        var mensaje = "Ingresa el valor que deseas convertir";
        double cantidad = 0;
        var monedaBase = "";
        var convertirA = "";

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
                        monedaBase = "USD";
                        convertirA = "COP";
                        System.out.println(mensaje);
                        cantidad = Double.parseDouble(scanner.nextLine());
                        valor.valorAConvertir(cantidad,monedaBase, convertirA);
                        break;
                    case 2:
                        monedaBase = "COP";
                        convertirA = "USD";
                        System.out.println(mensaje);
                        cantidad = Double.parseDouble(scanner.nextLine());
                        valor.valorAConvertir(cantidad,monedaBase, convertirA);
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
