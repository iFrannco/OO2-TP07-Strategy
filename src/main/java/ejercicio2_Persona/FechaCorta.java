package ejercicio2_Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements EstrategiaFecha {
    @Override
    public String formatear(LocalDate fechaDeNacimiento) {
        return fechaDeNacimiento.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }
}
