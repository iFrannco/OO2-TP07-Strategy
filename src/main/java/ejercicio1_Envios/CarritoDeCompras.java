package ejercicio1_Envios;

import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos;

    public CarritoDeCompras(List<Producto> productos) {
        this.productos = productos;
    }

    public float obtenerPrecioProductos() {
        float precioProductos = 0;
        for (Producto producto : productos) {
            precioProductos += producto.obtenerPrecio();
        }
        return precioProductos;
    }

    public float obtenerPesoTotal() {
        float pesoProductos = 0;
        for (Producto producto : productos) {
            pesoProductos += producto.obtenerPeso();
        }
        return pesoProductos;
    }
}
