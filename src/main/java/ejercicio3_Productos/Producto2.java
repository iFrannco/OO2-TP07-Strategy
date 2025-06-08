package ejercicio3_Productos;

class Producto2 {
    public double precio;
    public EstrategiaProducto estrategiaProducto;

    public Producto2(double precio, EstrategiaProducto estrategiaProducto) {
        this.precio = precio;
        this.estrategiaProducto = estrategiaProducto;
    }

    public double precioFinal() {
        double impuestos = estrategiaProducto.obtenerImpuestos(this.precio);
        double descuentos = estrategiaProducto.obtenerDescuentos(this.precio);
        boolean envioGratis = estrategiaProducto.aplicaEnvioGratis(this.precio);

        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}

