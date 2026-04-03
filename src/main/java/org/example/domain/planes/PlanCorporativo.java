package org.example.domain.planes;

import org.example.domain.clientes.Cliente;

public class PlanCorporativo extends Plan {
    private final double descuentoPorcentual;

    public PlanCorporativo(double monto, double descuentoPorcentual) {
        super(monto);
        this.descuentoPorcentual = descuentoPorcentual;
    }

    @Override
    public double getMonto(Cliente cliente) {
        return this.monto * (1.0 - this.descuentoPorcentual);
    }
}