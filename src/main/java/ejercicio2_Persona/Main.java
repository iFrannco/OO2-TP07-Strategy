package ejercicio2_Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var persona = new Persona(TipoFecha.FECHA_LARGA, LocalDate.of(2025, 1, 1));
        System.out.println(persona.fechaNacimiento());
    }
}
