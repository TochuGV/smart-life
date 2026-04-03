package org.example.domain.facturacion;

import org.example.domain.clientes.Cliente;

public class FacturaMensual {
    private final Integer mes;
    private final Cliente cliente;

    public FacturaMensual(Integer mes, Cliente cliente) {
        this.mes = mes;
        this.cliente = cliente;
    }

    public double calcularMonto() {
        return this.cliente.getPlan().getMonto(this.cliente);
    }
}