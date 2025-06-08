package ejercicio3_Productos;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto2(30, new EstrategiaLibro());
        var p2 = new Producto2(330, new EstrategiaMedicina());
        var p3 = new Producto2(130, new EstrategiaAlimento());
        var p4 = new Producto2(130, new EstrategiaOtro());
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}
