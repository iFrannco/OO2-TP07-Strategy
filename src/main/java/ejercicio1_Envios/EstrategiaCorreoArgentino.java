package ejercicio1_Envios;

public class EstrategiaCorreoArgentino extends EstrategiaEnvio {
    private static final float COSTO_POR_KM = 5;
    private CalculadorDistancia calculadorDistanciaKM;

    public EstrategiaCorreoArgentino(String origen, CalculadorDistancia calculadorDistanciaKM) {
        super(origen);
        this.calculadorDistanciaKM = calculadorDistanciaKM;
    }

    @Override
    public float calcularCostoEnvio(String destino, float pesoProductos) {
        float costoTotal = 0;
        if (destino.equals(destino.equalsIgnoreCase("Capital Federal"))) {
            costoTotal = 500;
        } else {
            costoTotal = 800;
            int distanciaEnKM = calculadorDistanciaKM.calcularDistancia(origen, destino);
            costoTotal += COSTO_POR_KM * distanciaEnKM;
        }

        return costoTotal;
    }

}
