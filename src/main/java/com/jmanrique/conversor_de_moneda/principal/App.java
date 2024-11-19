package com.jmanrique.conversor_de_moneda.principal;

import com.jmanrique.conversor_de_moneda.modelos.ConversionMoneda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversionMoneda valor = new ConversionMoneda();
        double cantidad;
        String monedaBase;
        String convertirA;
        var salir = "Elegiste salir del sistema...";

        var menu = """
                
                *****************************************************
                --> Bienvenid@ al sistema de conversion de moneda <--
                
                Por favor ingrese la moneda origen y destino (ej. USD) y el monto.
                >> Para salir ingrese -1 en el monto <<
                
                ******************************************************
                """;

        // menú
        try {
            while (true){
                System.out.println(menu);
                System.out.print("Ingrese el monto: ");
                cantidad = Double.parseDouble(scanner.nextLine());
                if(cantidad == -1){
                    System.out.println(salir);
                    return;
                }
                System.out.print("Ingrese la moneda de origen: ");
                monedaBase = scanner.nextLine().toUpperCase().strip();

                System.out.print("Ingrese la moneda destino: ");
                convertirA = scanner.nextLine().toUpperCase().strip();

                valor.valorAConvertir(cantidad,monedaBase, convertirA);
            }

        }catch (Exception e){
            System.out.println("Se presento un error en la conversión: " + e.getMessage());
        }
    }
}
