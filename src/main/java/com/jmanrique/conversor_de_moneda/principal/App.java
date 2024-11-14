package com.jmanrique.conversor_de_moneda.principal;

import com.jmanrique.conversor_de_moneda.modelos.ConsultaMoneda;
import com.jmanrique.conversor_de_moneda.modelos.Moneda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        var nombreMoneda = scanner.nextLine();
        Moneda moneda = consulta.buscar(nombreMoneda);
        System.out.println(moneda);
    }
}
