package ejercicio1_Envios;

public class EstrategiaColectivosSur implements EstrategiaEnvio {
    @Override
    public float calcularCostoEnvio(String destino, float pesoProductos) {
        float costoTotal = 0;
        if (destino.equals(destino.equalsIgnoreCase("Capital Federal"))) {
            costoTotal = 1000;
        } else if (destino.equalsIgnoreCase("GBA")) {
            costoTotal = 1500;

        } else {
            costoTotal = 3000;
        }

        if ((pesoProductos > 5) && (pesoProductos < 30)) {
            costoTotal += 500;
        } else if (pesoProductos > 30) {
            costoTotal += 2000;
        }

        return costoTotal;
    }
}
