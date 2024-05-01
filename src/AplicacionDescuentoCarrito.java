
public class AplicacionDescuentoCarrito {
    
    //Variables Estaticas para aplicar descuento.
    
    public static final double DESCUENTO_2 = 0.95;
    public static final double DESCUENTO_1 = 0.8;
    
    
   //Condicion para aplicar descuento segun precio y numero de productos.
    
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
    
    //Metodo que nos indicara el total a pagar aplicado en la condicion aplicarDescuento.
    
    private void totalPagar(double precioProducto, double descuentoAplicado) {
        double total;
        total = precioProducto * (descuentoAplicado);
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }   
}


