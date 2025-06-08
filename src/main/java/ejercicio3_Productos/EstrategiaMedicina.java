package ejercicio3_Productos;

public class EstrategiaMedicina implements EstrategiaProducto {
    private static final double IMPUESTOS = 0;
    private static final double DESCUENTO = 0.1;

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
        return precio > 100;
    }
}
