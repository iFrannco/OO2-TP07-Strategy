package ejercicio1_Envios;

public class Producto {
    private float precio;
    private float peso;

    public Producto(float precio, float peso) {
        if (precio < 0) {
            throw new RuntimeException("El precio no puede ser menor que cero");
        }
        if (peso < 0) {
            throw new RuntimeException("El peso no puede ser menor que cero");
        }
        this.precio = precio;
        this.peso = peso;
    }

    public float obtenerPrecio() {
        return this.precio;
    }

    public float obtenerPeso() {
        return this.peso;
    }
}
