package ejercicio1_Envios;

import java.util.HashMap;
import java.util.Map;

enum TipoEnivo {
    COLECTIVOS_SUR,
    CORREO_ARGENTINO
}

public class Calculador {
    private TipoEnivo tipoEnvio;
    private String destino;
    private CarritoDeCompras carrito;
    private Map<TipoEnivo, EstrategiaEnvio> estrategiasEnvio = new HashMap<>();

    public Calculador(TipoEnivo tipoEnvio, String destino, CarritoDeCompras carrito) {
        this.tipoEnvio = tipoEnvio;
        this.destino = destino;
        this.carrito = carrito;
        this.estrategiasEnvio.put(
                TipoEnivo.COLECTIVOS_SUR, new EstrategiaColectivosSur("Capital Federal"));
        this.estrategiasEnvio.put(
                TipoEnivo.CORREO_ARGENTINO, new EstrategiaCorreoArgentino(
                        "Capital Federal",
                        new CalculadorDistanciaWeb("www.ejemplo.com")));

    }

    public float calcularCostoTotal() {
        float precioProductos = carrito.obtenerPrecioProductos();
        float pesoProductos = carrito.obtenerPesoTotal();
        float precioEnvio = estrategiasEnvio.get(tipoEnvio).calcularCostoEnvio(this.destino, pesoProductos);

        return precioEnvio + precioProductos;
    }
}
