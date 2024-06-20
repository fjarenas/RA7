public class Medicamento extends Producto{
    public Medicamento(String nombreProducto, double precioSinIva) {    //Se quita double ivaAAplicar porque lo hemos indicado manualmente.
        super(nombreProducto, precioSinIva, 1.04);
    }

    @Override
    public String toString() {
        return String.format("MEDICAMENTO;%s;%.2f%n",super.getNombreProducto(),calcularIVA(getPrecioSinIva()));
    }
}


