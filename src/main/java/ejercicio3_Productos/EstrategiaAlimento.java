package ejercicio3_Productos;

public class EstrategiaAlimento implements EstrategiaProducto {
    private static final double IMPUESTOS = 0.05;
    private static final double DESCUENTO = 0.15;

    @Override
    public double obtenerImpuestos(double precio) {
        return IMPUESTOS;
    }

    @Override
    public double obtenerDescuentos(double precio) {
        return precio > 100 ? DESCUENTO : 0;
    }

    @Override
    public boolean aplicaEnvioGratis(double precio) {
        return precio > 200;
    }
}
