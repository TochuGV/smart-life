package org.example;

import org.example.domain.clientes.*;
import org.example.domain.facturacion.*;
import org.example.domain.planes.PlanHogar;
import org.example.domain.planes.PlanComercio;
import org.example.domain.planes.PlanCorporativo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SMARTLIFE - SISTEMA DE FACTURACIÓN === \n");

        PlanHogar planHogar = new PlanHogar(5000.0);
        PlanComercio planComercio = new PlanComercio(5000.0, 1000.0);
        PlanCorporativo planCorporativo = new PlanCorporativo(20000.0, 0.15);

        Cliente familiaPerez = new Cliente(TipoCliente.HOGAR, planHogar, 5);
        Cliente kioscoTito = new Cliente(TipoCliente.COMERCIO, planComercio, 3);
        Cliente multinacionalX = new Cliente(TipoCliente.CORPORATIVO, planCorporativo, 50);

        FacturaMensual facturaPerez = new FacturaMensual(4, familiaPerez);
        FacturaMensual facturaKiosco = new FacturaMensual(4, kioscoTito);
        FacturaMensual facturaMultinacional = new FacturaMensual(4, multinacionalX);

        System.out.println("FACTURA: FAMILIA PEREZ (HOGAR): $" + facturaPerez.calcularMonto());
        System.out.println("FACTURA: KIOSCO TITO (COMERCIO): $" + facturaKiosco.calcularMonto());
        System.out.println("FACTURA: MULTINACIONAL X (CORPORATIVO): $" + facturaMultinacional.calcularMonto());

        System.out.println("\n----------------------------------------\n");

        System.out.println("Intentando crear un cliente inconsistente...");
        try {
            // Se intenta poner un plan de hogar a un cliente comercial.
            Cliente clienteInvalido = new Cliente(TipoCliente.COMERCIO, planHogar, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("¡Validación exitosa! El sistema frenó el error: " + e.getMessage());
        }
    }
}