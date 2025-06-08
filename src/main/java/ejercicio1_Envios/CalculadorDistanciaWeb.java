package ejercicio1_Envios;

public class CalculadorDistanciaWeb implements CalculadorDistancia {
    private String url;

    public CalculadorDistanciaWeb(String url) {
        this.url = url;
    }

    @Override
    public int calcularDistancia(String origen, String destino) {
        // Una consulta a la pagina  http://distancia.ar?orgen=capital&destino=xxx
        return 50;
    }
}
