package org.example.domain.clientes;

import org.example.domain.planes.*;

public class Cliente {
    private final TipoCliente tipo;
    private final Plan plan;
    private final Integer dispositivos;

    public Cliente(TipoCliente tipo, Plan plan, Integer dispositivos) {
        validarPlan(tipo, plan);
        this.tipo = tipo;
        this.plan = plan;
        this.dispositivos = dispositivos;
    }

    public Plan getPlan() {
        return plan;
    }

    public Integer getDispositivos() {
        return dispositivos;
    }

    private void validarPlan(TipoCliente tipo, Plan plan) {
        boolean esValido = false;
        if (tipo == TipoCliente.HOGAR && plan instanceof PlanHogar) {
            esValido = true;
        } else if (tipo == TipoCliente.COMERCIO && plan instanceof PlanComercio) {
            esValido = true;
        } else if (tipo == TipoCliente.CORPORATIVO && plan instanceof PlanCorporativo) {
            esValido = true;
        }

        if (!esValido) {
            throw new IllegalArgumentException("El plan asignado no corresponde al tipo de cliente");
        }
    }
}