package ejercicio1_Envios;

import java.util.HashMap;
import java.util.Map;

enum TipoEnivo {
    COLECTIVOS_SUR,
    CORREO_ARGENTINO
}

public class Calculador {
    private TipoEnivo tipoEnivo;
    private String destino;
    private CarritoDeCompras carrito;
    private Map<TipoEnivo, EstrategiaEnvio> estrategiasEnvio = new HashMap<>();

    public Calculador(TipoEnivo tipoEnivo, String destino, CarritoDeCompras carrito) {
        this.tipoEnivo = tipoEnivo;
        this.destino = destino;
        this.carrito = carrito;
        this.estrategiasEnvio.put(
                TipoEnivo.COLECTIVOS_SUR, new EstrategiaColectivosSur());
        this.estrategiasEnvio.put(
                TipoEnivo.CORREO_ARGENTINO, new EstrategiaCorreoArgentino(new CalculadorDistanciaWeb()));

    }

    public float calcularCostoTotal() {
        float precioProductos = carrito.obtenerPrecioProductos();
        float pesoProductos = carrito.obtenerPesoTotal();
        float precioEnvio = estrategiasEnvio.get(tipoEnivo).calcularCostoEnvio(this.destino, pesoProductos);

        return precioEnvio + precioProductos;
    }
}
