package org.example.domain.clientes;

import org.example.domain.planes.PlanHogar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

class ClienteTest {
    @Test
    @DisplayName("Debería lanzar una excepción cuando el plan y el tipo no coinciden")
    void Test1(){
        PlanHogar planHogar = new PlanHogar(5000.0);
        IllegalArgumentException excepcion = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Cliente(TipoCliente.COMERCIO, planHogar, 2)
        );
        Assertions.assertEquals("El plan asignado no corresponde al tipo de cliente", excepcion.getMessage());
    }

    // También se puede hacer con un Try-Catch, dejando al final el error forzado para que sea atrapado.
    // No se puede instanciar antes el cliente porque colapsa el programa.
}

