package org.example.domain.planes;

import org.example.domain.clientes.Cliente;

public abstract class Plan {
    protected double monto;

    public Plan(double monto) {
        this.monto = monto;
    }

    public abstract double getMonto(Cliente cliente);
}