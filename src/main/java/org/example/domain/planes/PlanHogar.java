package org.example.domain.planes;

import org.example.domain.clientes.Cliente;

public class PlanHogar extends Plan {

    public PlanHogar(double monto) {
        super(monto);
    }

    @Override
    public double getMonto(Cliente cliente) {
        return this.monto;
    }
}