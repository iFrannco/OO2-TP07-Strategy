package ejercicio3_Productos;

public class EstrategiaLibro implements EstrategiaProducto {
    private static final double IMPUESTOS = 0.1;
    private static final double DESCUENTO = 0.1;

    @Override
    public double obtenerImpuestos(double precio) {
        return IMPUESTOS;
    }

    @Override
    public double obtenerDescuentos(double precio) {
        return DESCUENTO;
    }

    @Override
    public boolean aplicaEnvioGratis(double precio) {
        return precio > 100;
    }

}
