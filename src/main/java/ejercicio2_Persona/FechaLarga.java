package ejercicio2_Persona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaLarga implements EstrategiaFecha {
    @Override
    public String formatear(LocalDate fechaDeNacimiento) {
        return fechaDeNacimiento.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es", "ES")));
    }
}
