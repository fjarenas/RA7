public class ProductoParaFarmacia extends Producto{
    public ProductoParaFarmacia(String nombreProducto, double precioSinIva) {       //Se quita double ivaAAplicar porque lo hemos indicado manualmente.
        super(nombreProducto, precioSinIva, 1.21);
    }

    @Override
    public String toString() {
        return String.format("PARAFARMACIA;%s;%.2f%n",super.getNombreProducto(),calcularIVA(getPrecioSinIva()));
    }
}
