package ejercicio3_Productos;

public interface EstrategiaProducto {
    double obtenerImpuestos(double precio);

    double obtenerDescuentos(double precio);

    boolean aplicaEnvioGratis(double precio);
}
