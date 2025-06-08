package ejercicio3_Productos;

public class EstrategiaOtro implements EstrategiaProducto {
    private static final double IMPUESTOS = 0.15;
    private static final double DESCUENTO = 0.05;

    @Override
    public double obtenerImpuestos(double precio) {
        return IMPUESTOS;
    }

    @Override
    public double obtenerDescuentos(double precio) {
        return precio > 50 ? DESCUENTO : 0;
    }

    @Override
    public boolean aplicaEnvioGratis(double precio) {
        return precio > 200;
    }
}
