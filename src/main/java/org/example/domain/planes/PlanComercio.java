package org.example.domain.planes;

import org.example.domain.clientes.Cliente;

public class PlanComercio extends Plan {
    private final double adicionalPorDispositivo;

    public PlanComercio(double monto, double adicionalPorDispositivo) {
        super(monto);
        this.adicionalPorDispositivo = adicionalPorDispositivo;
    }

    @Override
    public double getMonto(Cliente cliente) {
        return this.monto + (this.adicionalPorDispositivo * cliente.getDispositivos());
    }
}