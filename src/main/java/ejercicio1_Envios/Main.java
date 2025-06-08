package ejercicio1_Envios;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var carrito = new CarritoDeCompras(List.of(
                new Producto(200, 40),
                new Producto(140, 20)
        ));
        var calculador = new Calculador(TipoEnivo.CORREO_ARGENTINO, "GBA", carrito);
        System.out.println(calculador.calcularCostoTotal());
    }
}
