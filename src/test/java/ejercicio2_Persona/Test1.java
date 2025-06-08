package ejercicio2_Persona;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void testFechaCorta() {
        // set up
        var persona = new Persona(TipoFecha.FECHA_CORTA, LocalDate.of(2000, 1, 1));

        // exercise
        String fechaDeNacimiento = persona.fechaNacimiento();

        // verify
        assertEquals("1-01-2000", fechaDeNacimiento);
    }

    @Test
    public void testFechaLarga() {
        // set up
        var persona = new Persona(TipoFecha.FECHA_LARGA, LocalDate.of(2025, 2, 2));

        // exercise
        String fechaDeNacimiento = persona.fechaNacimiento();

        // verify
        assertEquals("2 de febrero de 2025", fechaDeNacimiento);
    }
}
