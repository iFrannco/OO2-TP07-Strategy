package ejercicio2_Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

enum TipoFecha {
    FECHA_CORTA,
    FECHA_LARGA
}

public class Persona {
    private LocalDate fechaDeNacimiento;
    private Map<String, EstrategiaFecha> estrategiasFecha = new HashMap<>();
    private TipoFecha tipo;

    public Persona(TipoFecha tipoFecha, LocalDate fechaDeNacimiento) {
        this.estrategiasFecha.put(
                TipoFecha.FECHA_CORTA.name(), new FechaCorta());
        this.estrategiasFecha.put(
                TipoFecha.FECHA_LARGA.name(), new FechaLarga());
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tipo = tipoFecha;
    }

    public String fechaNacimiento() {
        return estrategiasFecha.get(this.tipo.name()).formatear(fechaDeNacimiento);
    }
}
