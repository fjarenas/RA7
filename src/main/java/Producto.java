/**
 * La clase Producto representa un producto farmacéutico con su nombre, precio sin IVA, y el IVA a aplicar.
 * @author Francisco Javier Arenas Diaz
 * @version 1.0
 * @since 1.0
 */
public class Producto implements ProductoFarmaceutico{
    /**
     * Definición de los parámetros.
     */
    private String nombreProducto;
    private double precioSinIva;
    private double ivaAAplicar;
    /**
     * Constructor para crear un nuevo producto.
     *
     * @param nombreProducto el nombre del producto.
     * @param precioSinIva el precio del producto sin IVA.
     * @param ivaAAplicar el IVA a aplicar al producto.
     */
    public Producto(String nombreProducto, double precioSinIva, double ivaAAplicar) {
        this.nombreProducto = nombreProducto;
        this.precioSinIva = precioSinIva;
        this.ivaAAplicar = ivaAAplicar;
    }
    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto.
     */

    public String getNombreProducto() {
        return nombreProducto;
    }
    /**
     * Establece el nombre del producto.
     *
     * @param nombreProducto el nuevo nombre del producto.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public double getPrecioSinIva() {
        return precioSinIva;
    }
    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }
    public double getIvaAAplicar() {
        return ivaAAplicar;
    }
    public void setIvaAAplicar(double ivaAAplicar) {
        this.ivaAAplicar = ivaAAplicar;
    }
    /**
     * Calcula el IVA basado en el precio sin IVA.
     *
     * @param precioSinIVA el precio del producto sin IVA.
     * @return el valor del IVA calculado.
     */
    @Override
    public double calcularIVA(double precioSinIVA) {
        return precioSinIVA * ivaAAplicar;
    }
    /**
     * Devuelve una representación en forma de cadena del producto, incluyendo su nombre y el precio con IVA.
     *
     * @return una cadena que representa el producto.
     */
    @Override
    public String toString() {
        return String.format("%s;%.2f%n",nombreProducto,calcularIVA(precioSinIva));
    }
}
