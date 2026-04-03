package org.example.domain.facturacion;

import org.example.domain.clientes.*;
import org.example.domain.planes.PlanHogar;
import org.example.domain.planes.PlanComercio;
import org.example.domain.planes.PlanCorporativo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

class FacturaMensualTest {
    @Test
    @DisplayName("Debería cobrar una tarifa plana para un cliente de hogar")
    void Test1(){
        PlanHogar plan = new PlanHogar(5000.0);
        Cliente familia = new Cliente(TipoCliente.HOGAR, plan, 99);
        FacturaMensual factura = new FacturaMensual(4, familia);
        Assertions.assertEquals(5000.0, factura.calcularMonto());
    }

    @Test
    @DisplayName("Debería sumar adicional por dispositivo para un cliente comercial")
    void Test2(){
        PlanComercio plan = new PlanComercio(5000.0, 1000.0);
        Cliente kiosco = new Cliente(TipoCliente.COMERCIO, plan, 3);
        FacturaMensual factura = new FacturaMensual(4, kiosco);
        Assertions.assertEquals(8000.0, factura.calcularMonto());
    }

    @Test
    @DisplayName("Debería aplicar descuento porcental con un cliente corporativo")
    void Test3(){
        PlanCorporativo plan = new PlanCorporativo(20000.0, 0.15);
        Cliente empresa = new Cliente(TipoCliente.CORPORATIVO, plan, 50);
        FacturaMensual factura = new FacturaMensual(4, empresa);
        Assertions.assertEquals(17000.0, factura.calcularMonto());
    }
}