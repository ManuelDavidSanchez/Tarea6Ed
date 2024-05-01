
public class AplicacionDescuentoCarrito {

    public static final double DESCUENTO_2 = 0.95;
    public static final double DESCUENTO_1 = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
   
        if (numProductos > 3) {
            precioProducto -= 5;
                if (numProductos != 0) {
                totalPagar(precioProducto, DESCUENTO_1);
            } else {
                totalPagar(precioProducto, DESCUENTO_2);
            }
        }
    }

    private void totalPagar(double precioProducto, double descuentoAplicado) {
        double total;
        total = precioProducto * (descuentoAplicado);
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }   
}


