package ejercicio1_Envios;

public abstract class EstrategiaEnvio {
    protected String origen;

    public EstrategiaEnvio(String origen) {
        this.origen = origen;
    }

    abstract float calcularCostoEnvio(String destino, float pesoProductos);
}
